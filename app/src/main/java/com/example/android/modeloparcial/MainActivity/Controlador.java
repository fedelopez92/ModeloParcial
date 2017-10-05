package com.example.android.modeloparcial.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.android.modeloparcial.Contacto;
import com.example.android.modeloparcial.MyAdapter;

/**
 * Created by android on 28/09/17.
 */

public class Controlador {

    private Vista vista;
    private Modelo modelo;

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }


    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        Modelo.getListaContactos().add(new Contacto("Fede", "Lopez", "4444444"));
        Modelo.getListaContactos().add(new Contacto("Matias", "Castaneda", "1111111"));
        Modelo.getListaContactos().add(new Contacto("Pablo", "Speranza", "2343212"));
        Modelo.getListaContactos().add(new Contacto("Elias", "Dufau", "4543344"));
        Modelo.getListaContactos().add(new Contacto("Matias", "Ramos", "5453454"));
        Modelo.getListaContactos().add(new Contacto("Javier", "Topalian", "4534534"));
        Modelo.getListaContactos().add(new Contacto("Selene", "Montano", "4545435"));
        Modelo.getListaContactos().add(new Contacto("Wendy", "Colace", "5534543"));
    }

}
