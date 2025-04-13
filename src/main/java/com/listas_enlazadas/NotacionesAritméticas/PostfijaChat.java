package com.listas_enlazadas.NotacionesAritméticas;

import java.util.Stack;

public class PostfijaChat {
    
    // Prioridad de los operadores
    private static int getPrecedence(char op) {
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    // Método para convertir infija a postfija
    public static String infijaAPostfija(String expresion) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            // Si es un operando, lo agregamos directamente
            if (Character.isLetterOrDigit(c)) {
                resultado.append(c);
            }

            // Si es '(', lo metemos en la pila
            else if (c == '(') {
                pila.push(c);
            }

            // Si es ')', desapilamos hasta encontrar '('
            else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    resultado.append(pila.pop());
                }
                if (!pila.isEmpty() && pila.peek() == '(') {
                    pila.pop(); // Quitar el '('
                } else {
                    return "Expresión inválida";
                }
            }

            // Si es operador
            else {
                while (!pila.isEmpty() && getPrecedence(c) <= getPrecedence(pila.peek())) {
                    resultado.append(pila.pop());
                }
                pila.push(c);
            }
        }

        // Sacamos cualquier operador restante
        while (!pila.isEmpty()) {
            if (pila.peek() == '(') return "Expresión inválida";
            resultado.append(pila.pop());
        }

        return resultado.toString();
    }

    // Prueba
    public static void main(String[] args) {
        String infija = "A*(B+C)/D";
        String postfija = infijaAPostfija(infija);
        System.out.println("Expresión infija: " + infija);
        System.out.println("Expresión postfija: " + postfija);
    }
}
