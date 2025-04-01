package com.listas_enlazadas.ListaEnlazadaSimple;

public class Persona {

    private Integer cedula;

    public Persona(Integer cedula) {
        this.cedula = cedula;
    }

    public Integer getCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        return "Persona [cedula=" + cedula + "]";
    }
}
