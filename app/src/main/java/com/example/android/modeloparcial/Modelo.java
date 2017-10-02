package com.example.android.modeloparcial;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android on 28/09/17.
 */

public class Modelo {

    private List<Contacto> listaContactos;

    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public Modelo() {
        this.listaContactos = new ArrayList<Contacto>();
    }
}
