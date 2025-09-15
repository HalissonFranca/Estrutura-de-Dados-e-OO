package org.ed;

import org.ed.interfaces.IEstruturaDeDados;

public class FilaEncadeada implements IEstruturaDeDados {
    private static class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public FilaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    @Override
    public void adicionar(int valor) {
        No novo = new No(valor);
        if (estaVazia()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        tamanho++;
    }

    @Override
    public char remover() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia!");
        }
        int valor = inicio.valor;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return (char) valor;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean estaVazia() {
        return inicio == null;
    }

    public int peek() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia!");
        }
        return inicio.valor;
    }
}
