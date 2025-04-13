package com.listas_enlazadas.Pila;

public class Pila <T> {

    private Nodo<T> cima;
    private int tamano;

    public void push(T value) {

        Nodo<T> nodo = new Nodo<T>(value);

        nodo.setSiguiente(cima);
        cima = nodo;
        tamano ++;
    }

    public T pop() {

        if (esVacia()) {
            return null;
        }
        T value = cima.getValor();
        cima = cima.getSiguiente();
        tamano --;
        return value;
    }

    public boolean esVacia() {
        return cima == null;
    }
}
