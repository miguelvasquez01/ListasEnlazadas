package com.listas_enlazadas.ListaCircularEnlazadaSimple;

public class ListaCircularSimple <T> {
    
    private Nodo<T> ultimo;
    private int tamano;

    public void agregarInicio(T valor) {

        Nodo<T> nodo = new Nodo<T>(valor);

        if (ultimo == null) {
            ultimo = nodo;
        } else {
            
        }
    }
}
