package com.listas_enlazadas.ListaEnlazadaSimple;

public class ListaSimple <T> {
    
    private Nodo<T> inicial;
    private int tamano = 0;

    //Escribir un método que retorne la cantidad de veces que se repite un valor en una lista enlazada.
    public int vecesQueRepite(T valor) {

        int cont = 0;
        Nodo<T> nodoRecorrer = inicial;
        while (nodoRecorrer != null) {

            if (nodoRecorrer.getValor().equals(valor)) {

                cont ++;
            }
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }
        return cont;
    }

    //Escribir un método que devuelva una lista enlazada con los valores impares de una lista de números.
    public ListaSimple<Integer> valoresImpares() {

        ListaSimple<Integer> listaFinal = new ListaSimple<>();
        if (inicial == null) return listaFinal;

        Nodo<T> nodoRecorrer = inicial;
        while (nodoRecorrer != null) {

            if ((Integer) nodoRecorrer.getValor() % 2 != 0) {
                listaFinal.agregarFinal((Integer) nodoRecorrer.getValor());
            }
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }
        return listaFinal;
    }

    //Eliminar los números pares de una lista enlazada simple
    @SuppressWarnings("unchecked")
    public void eliminarPares() {

        if (inicial == null) return;

        Nodo<Integer> nodoRecorrer = (Nodo<Integer>) inicial;
        //Eliminar todos los pares del inicio
        while (inicial != null && (Integer) inicial.getValor() % 2 == 0) {
            inicial = (Nodo<T>) inicial.getSiguiente();
        }

        while (nodoRecorrer.getSiguiente() != null) {

            if (nodoRecorrer.getSiguiente().getValor() % 2 == 0) {//Aquí avanzo uno
                nodoRecorrer.setSiguiente(nodoRecorrer.getSiguiente().getSiguiente());
            } else {
                nodoRecorrer = nodoRecorrer.getSiguiente();
            }
        }
    }

    //Obtener la lista de personas tengan cédula con cantidad de números par de una lista enlazada simple de personas.
    public ListaSimple<Persona> obtenerCedulasPar() {

        ListaSimple<Persona> listaFinal = new ListaSimple<>();

        @SuppressWarnings("unchecked")
        Nodo<Persona> nodoRecorrer = (Nodo<Persona>) inicial;
        while (nodoRecorrer != null) {

            if (String.valueOf(nodoRecorrer.getValor().getCedula()).length() % 2 == 0) {
                listaFinal.agregarFinal(nodoRecorrer.getValor());
            }
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }
        return listaFinal;
    }

    //Obtener los números de las posiciones impares de una lista enlazada simple de números
    public ListaSimple<T> obtenerPosicionesImpares() {

        ListaSimple<T> listaFinal = new ListaSimple<>();

        int cont = 0;
        Nodo<T> nodoRecorrer = inicial;
        while (nodoRecorrer != null) {

            if (cont % 2 != 0) {
                listaFinal.agregarFinal(nodoRecorrer.getValor());
            }
            cont ++;
            nodoRecorrer = nodoRecorrer.getSiguiente();
        }
        return listaFinal;
    }

    //Laboratorio ^^^^^^^

    public void invertir() {

        //ListaSimple<T> listaInvert = new ListaSimple<>();
        Nodo<T> nodoRecorrer = inicial;
        while (nodoRecorrer != null) {

            nodoRecorrer = nodoRecorrer.getSiguiente();
        }
    }

    public ListaSimple<T> intercalarDosListas(ListaSimple<T> lista1, ListaSimple<T> lista2) {

        ListaSimple<T> listaFinal = new ListaSimple<>();

        Nodo<T> nodoRecorrer1 = lista1.getInicial();
        Nodo<T> nodoRecorrer2 = lista2.getInicial();
        while (nodoRecorrer1 != null || nodoRecorrer2 != null) {

            if (nodoRecorrer1 != null) {

                listaFinal.agregarFinal(nodoRecorrer1.getValor());
                nodoRecorrer1 = nodoRecorrer1.getSiguiente();

            } if (nodoRecorrer2 != null) {

                listaFinal.agregarFinal(nodoRecorrer2.getValor());
                nodoRecorrer2 = nodoRecorrer2.getSiguiente();
            }
        }
        return listaFinal;
    }

    public void eliminar(T value) {
        
        if (inicial == null) {
            System.out.println("Lista vacía");
            return;
        }

        //if si voy a eliminar el primer elemento
        if (inicial.getValor().equals(value)) {
            inicial = inicial.getSiguiente();
            return;
        }

        Nodo<T> nodoRecorrer = inicial;
        while (nodoRecorrer.getSiguiente() != null) {

            if (nodoRecorrer.getSiguiente().getValor().equals(value)) {
                nodoRecorrer.setSiguiente(nodoRecorrer.getSiguiente().getSiguiente());
                return;
            }
            nodoRecorrer = nodoRecorrer.getSiguiente();//Establezco el último como null
        }
    }

    public void agregarFinal(T valor) {

        Nodo<T> nodo = new Nodo<T>(valor);

        if (inicial == null) {  
            inicial = nodo;
        } else {

            Nodo<T> nodoRecorrer = inicial;
            while (nodoRecorrer.getSiguiente() != null) {

                nodoRecorrer = nodoRecorrer.getSiguiente();
            }
            nodoRecorrer.setSiguiente(nodo);
        }
        tamano +=1;
    }

    public void agregarInicio(T valor) {

        Nodo<T> nodo = new Nodo<T>(valor);

        if (inicial == null) {
            inicial = nodo;
        } else {

            nodo.setSiguiente(inicial);
            inicial = nodo;
        }
        tamano += 1;
    }

    public void mostrarLista() {

        if (inicial == null) {
            System.out.println("Lista vacía");
        }

        Nodo<T> nodoRecorrer = inicial;
        do {

            System.out.print(nodoRecorrer.getValor() + ", ");
            nodoRecorrer = nodoRecorrer.getSiguiente();

        } while (nodoRecorrer != null);
    }

    public Nodo<T> getInicial() {
        return inicial;
    }

    public void setInicial(Nodo<T> inicial) {
        this.inicial = inicial;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
}
