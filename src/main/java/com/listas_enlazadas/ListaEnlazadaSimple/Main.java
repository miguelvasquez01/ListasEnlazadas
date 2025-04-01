package com.listas_enlazadas.ListaEnlazadaSimple;

public class Main {
    
    public static void main(String[] args) {
        
        ListaSimple<Integer> lista = new ListaSimple<>();
        lista.agregarInicio(21);
        lista.agregarInicio(31);
        lista.agregarInicio(44);

        lista.agregarFinal(101);
        lista.agregarFinal(101);
        lista.agregarFinal(104);

        lista.mostrarLista();

        // System.out.println("\nLista con valor eliminado:");
        // lista.eliminar(103);
        // lista.mostrarLista();

        //-------------------------
        //Laboratorio:

        System.out.println("\n----->Lista con posiciones impares:");
        ListaSimple<Integer> listaPosiImpares = lista.obtenerPosicionesImpares();
        listaPosiImpares.mostrarLista();

        System.out.println("\n----->Lista con cédulas pares:");
        ListaSimple<Persona> listaPersonas = new ListaSimple<>();
        Persona p1 = new Persona(1234);
        Persona p2 = new Persona(42423);
        Persona p3 = new Persona(38293289);
        listaPersonas.agregarFinal(p1);
        listaPersonas.agregarFinal(p2);
        listaPersonas.agregarFinal(p3);

        ListaSimple<Persona> listaPares = listaPersonas.obtenerCedulasPar();
        listaPares.mostrarLista();

        // System.out.println("\n----->Eliminar números pares:");
        // lista.eliminarPares();
        // lista.mostrarLista();

        System.out.println("\n----->Devolver números impares:");
        ListaSimple<Integer> listaImpares = lista.valoresImpares();
        listaImpares.mostrarLista();

        System.out.println("\n----->Cantidad de veces que se repite un valor:");
        System.out.print(lista.vecesQueRepite(101));

        //-------------------------

        System.out.println("\nLista intercalada:");
        ListaSimple<Integer> lista2 = new ListaSimple<>();
        lista2.agregarFinal(333);
        lista2.agregarFinal(333);

        ListaSimple<Integer> listaIntercalada = new ListaSimple<>();
        listaIntercalada = listaIntercalada.intercalarDosListas(lista, lista2);
        listaIntercalada.mostrarLista();
    }
}
