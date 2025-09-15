package org.ed.fila;

public class Pontuacao {
    public static final int maxEntradas = 10;
    protected int numEntradas;
    protected EntradaDoJogo[] entradas;

    public Pontuacao(){
        entradas = new EntradaDoJogo[maxEntradas];
        numEntradas = 0;
    }

    public String toString(){
        String s = "[";
        for (int i = 0; i < numEntradas; i++) {
            if (i > 0) s += ", ";
            s += entradas[i];
        }
        return s + "]";
    }

    // getters e setters
}
