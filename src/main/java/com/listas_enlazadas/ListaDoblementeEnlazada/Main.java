package com.listas_enlazadas.ListaDoblementeEnlazada;

public class Main {
    
    public static void main(String[] args) {
        
        ListaDoble<Integer> lista = new ListaDoble<>();
        lista.agregarFinal(21);
        lista.agregarFinal(22);
        lista.agregarFinal(23);
        lista.agregarFinal(24);

        lista.mostrar();
    }
}
