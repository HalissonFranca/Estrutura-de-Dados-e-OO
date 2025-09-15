package org.ed;

public class FilaDuplamenteEncadeada {
    private static class No {
        int valor;
        No anterior;
        No proximo;

        No(int valor) {
            this.valor = valor;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public FilaDuplamenteEncadeada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void adicionarNoFim(int valor) {
        No novo = new No(valor);
        if (estaVazio()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public void adicionarNoInicio(int valor) {
        No novo = new No(valor);
        if (estaVazio()) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public int removerDoInicio() {
        if (estaVazio()) {
            throw new RuntimeException("Fila vazia!");
        }
        int valor = inicio.valor;
        inicio = inicio.proximo;
        if (inicio != null) {
            inicio.anterior = null;
        } else {
            fim = null; // fila ficou vazia
        }
        tamanho--;
        return valor;
    }

    public int removerDoFim() {
        if (estaVazio()) {
            throw new RuntimeException("Fila vazia!");
        }
        int valor = fim.valor;
        fim = fim.anterior;
        if (fim != null) {
            fim.proximo = null;
        } else {
            inicio = null; // fila ficou vazia
        }
        tamanho--;
        return valor;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }
}