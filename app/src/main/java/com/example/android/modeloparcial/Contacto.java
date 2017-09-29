package com.example.android.modeloparcial;

/**
 * Created by android on 28/09/17.
 */

public class Contacto {

    private String nombre;
    private String apellido;
    private String telefono;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
}
