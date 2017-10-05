package com.example.android.modeloparcial.ActivityNuevoContacto;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.modeloparcial.R;

/**
 * Created by Fede on 05/10/2017.
 */

public class Vista {

    public EditText edNombre;
    public EditText edApellido;
    public EditText edNumero;
    public Button btnAgregar;


    public Vista(Activity activity) {
        this.edNombre = (EditText) activity.findViewById(R.id.edNombre);
        this.edApellido = (EditText) activity.findViewById(R.id.edApellido);
        this.edNumero = (EditText) activity.findViewById(R.id.edNumero);
        this.btnAgregar = (Button) activity.findViewById(R.id.btnAgregar);
    }

    public void setearListener(View.OnClickListener myListener){
        this.btnAgregar.setOnClickListener(myListener);
    }

}
