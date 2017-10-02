package com.example.android.modeloparcial;

import java.util.ArrayList;
import java.util.List;

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

        this.modelo.getListaContactos().add(new Contacto("Fede", "Lopez", "4444444"));
        this.modelo.getListaContactos().add(new Contacto("Matias", "Castaneda", "1111111"));
        this.modelo.getListaContactos().add(new Contacto("Pablo", "Speranza", "2343212"));
        this.modelo.getListaContactos().add(new Contacto("Elias", "Dufau", "4543344"));
        this.modelo.getListaContactos().add(new Contacto("Matias", "Ramos", "5453454"));
        this.modelo.getListaContactos().add(new Contacto("Javier", "Topalian", "4534534"));
        this.modelo.getListaContactos().add(new Contacto("Selene", "Montano", "4545435"));
        this.modelo.getListaContactos().add(new Contacto("Wendy", "Colace", "5534543"));
    }

    public void AgregarContacto(String nombre, String apellido, String telefono){

        this.modelo.getListaContactos().add(new Contacto(nombre, apellido, telefono));
    }
}
