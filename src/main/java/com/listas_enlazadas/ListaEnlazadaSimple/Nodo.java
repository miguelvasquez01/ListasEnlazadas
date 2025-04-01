package com.listas_enlazadas.ListaEnlazadaSimple;

public class Nodo <T> {
    
    private Nodo<T> siguiente;
    private T valor;

    public Nodo(T valor) {
        this.valor = valor;
    }
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
}