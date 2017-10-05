package com.example.android.modeloparcial.ActivityNuevoContacto;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.android.modeloparcial.Contacto;
import com.example.android.modeloparcial.MyAdapter;

/**
 * Created by Fede on 05/10/2017.
 */

public class MyListener implements OnClickListener {

    private Intent intent;
    private Activity activity;
    private Vista vista;


    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public MyListener(Activity activity, Intent intent, Vista vista) {
        this.activity = activity;
        this.intent = intent;
        this.vista = vista;
    }

    @Override
    public void onClick(View view) {

            com.example.android.modeloparcial.MainActivity.Modelo.getListaContactos().add(new Contacto(vista.edNombre.getText().toString(), vista.edApellido.getText().toString(), vista.edNumero.getText().toString()));
            activity.setResult(Activity.RESULT_OK, intent);
            activity.finish();
    }

}
