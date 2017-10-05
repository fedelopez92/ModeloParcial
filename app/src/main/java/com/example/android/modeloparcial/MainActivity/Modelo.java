package com.example.android.modeloparcial.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.android.modeloparcial.Contacto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android on 28/09/17.
 */

public class Modelo {

    private Intent intent;
    private Activity activity;
    private String nombre;
    private String apellido;
    private String numero;
    private static List<Contacto> listaContactos;


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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static List<Contacto> getListaContactos() {
        return listaContactos;
    }

    public static void setListaContactos(List<Contacto> listaContactos) {
        Modelo.listaContactos = listaContactos;
    }

    public Modelo() {

        listaContactos = new ArrayList<Contacto>();
    }
}
