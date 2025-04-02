package com.listas_enlazadas.ListaDoblementeEnlazada;

public class ListaDoble <T> {
    
    private Nodo<T> inicial;
    private Nodo<T> ultimo;
    private int tamano = 0;

    //Obtener la lista de personas tengan cédula con cantidad de elementos par de una lista enlazada doble de personas.
    //Escribir el Iterador para una lista doblemente enlazada.
    //Escribir el método imprimirHaciaAtras() de una lista doblemente enlazada.

    public void eliminar(T valor) {

        if (inicial == null || ultimo == null) return;

        if (inicial.getValor().equals(valor)) {
            if (inicial == ultimo) { // Si solo hay un nodo en la lista
                inicial = null;
                ultimo = null;
            } else {
                inicial = inicial.getSiguiente();
                inicial.setAnterior(null);
            }
            tamano--;
            return;
    }

        Nodo<T> nodoRecorrer = inicial;
        while (nodoRecorrer != null) {

            if (nodoRecorrer.getValor().equals(valor)) {
                nodoRecorrer.getAnterior().setSiguiente(nodoRecorrer.getSiguiente());

                if (nodoRecorrer.getSiguiente() != null) {
                    nodoRecorrer.getSiguiente().setAnterior(nodoRecorrer.getAnterior());
                    tamano--;
                    return;
                }
            }
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }
    }

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
