package com.example.android.modeloparcial.ActivityNuevoContacto;

import android.content.Intent;
import android.graphics.PorterDuff;

import com.example.android.modeloparcial.MainActivity.*;

/**
 * Created by Fede on 05/10/2017.
 */

public class Controlador {

    private Modelo modelo;
    private Vista vista;

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

}
