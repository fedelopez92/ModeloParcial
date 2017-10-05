package com.example.android.modeloparcial.MainActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.modeloparcial.ActivityNuevoContacto.NuevoContacto;
import com.example.android.modeloparcial.MyAdapter;
import com.example.android.modeloparcial.R;

public class MainActivity extends AppCompatActivity {

    private static final int PERMISO_REQUERIDO = 100;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {


            } else {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, PERMISO_REQUERIDO);
            }
        }

        Modelo modelo = new Modelo();
        Vista vista = new Vista(this);
        Controlador controlador = new Controlador(modelo, vista);
        myAdapter = new MyAdapter(this);

        vista.setearAdapter(myAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mi_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.op1:
                Intent intent = new Intent(this, NuevoContacto.class);
                startActivityForResult(intent, 1);
                break;

            case R.id.op2:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1 && resultCode == RESULT_OK) {
                myAdapter.notifyDataSetChanged();
        }
    }
}
