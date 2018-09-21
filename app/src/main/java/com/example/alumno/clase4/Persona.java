package com.example.alumno.clase4;

/**
 * Created by alumno on 20/09/2018.
 */

public class Persona {

    String nombre;
    String apellido;

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
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
}
