package com.listas_enlazadas.NotacionesAritméticas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Postfija {
    
    public static void main(String[] args) {
        
        System.out.println(infijaAPostfija("x*(a/b)"));
        //char [] x = {'a', '^', 'b'};
        ArrayList<Character> x1 = new ArrayList<>(Arrays.asList('a', '^', 'b'));
        System.out.println(operarParentesis(x1));
    }

    public static String infijaAPostfija(String infija) {

        //StringBuilder respuesta = new StringBuilder();
        ArrayList<Character> interParentesis = new ArrayList<>();
        char[] lista = infija.toCharArray();

        for (int i = 0; i<lista.length; i++) {

            if (lista[i] == '(') {  //2 = (

                for (int j = i+1; j < i+4; j++) {

                    interParentesis.add(lista[j]);
                }
            }
            if (i<7) {
                continue;
            }
        }
        return operarParentesis(interParentesis);
    }

    public static String operarParentesis(ArrayList<Character> valor) {

        char[] simbolos = {'^', '*', '/', '+', '-'};
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        char s = '0';

        for (int i = 0; i<valor.size(); i++) {

            for (int j = 0; j<simbolos.length; j++) {

                if (valor.get(i) == simbolos[j]) {

                    s = valor.get(i);
                    continue;
                } else {

                    set.add(valor.get(i));
                }
            }
        }
        set.add(s);
        set.forEach(c -> sb.append(c));
        return sb.toString();
    }
}
