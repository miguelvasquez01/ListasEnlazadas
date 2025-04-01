package com.listas_enlazadas.ListaDoblementeEnlazada;

public class ListaDoble <T> {
    
    private Nodo<T> inicial;
    private Nodo<T> ultimo;
    private int tamano = 0;

    public void mostrar() {

        if (inicial == null || ultimo == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo<T> nodoRecorrer = inicial;
        while (nodoRecorrer != null) { //nodoRecorrer != ultimo

            System.out.print(nodoRecorrer.getValor() + ", ");
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }
        // System.out.print(ultimo.getValor());
        System.out.println();
    }

    public void agregarFinal(T valor) {

        Nodo<T> nodo = new Nodo<T>(valor);

        if (inicial == null || ultimo == null) {
            inicial = nodo;
            ultimo = nodo;
        } else {

            ultimo.setSiguiente(nodo);
            nodo.setAnterior(ultimo);
            ultimo = nodo;
        }
        tamano++;
    }
}
