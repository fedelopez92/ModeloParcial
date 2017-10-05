package com.example.android.modeloparcial.ActivityNuevoContacto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.modeloparcial.MainActivity.*;
import com.example.android.modeloparcial.R;

public class NuevoContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nuevo_contacto);

        Intent intent = new Intent(this, MainActivity.class);
        Vista vista = new Vista(this);
        Modelo modelo = new Modelo();
        MyListener myListener = new MyListener(this, intent, vista);
        Controlador controlador = new Controlador(modelo, vista);

        vista.setearListener(myListener);
    }
}
