package com.itesm.avril.listfragment;

public class Perro {

    private String nombre, raza, caracteristicas;

    public Perro(String nombre, String raza, String caracteristicas) {

        super();
        this.nombre             = nombre;
        this.raza               = raza;
        this.caracteristicas    = caracteristicas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}


