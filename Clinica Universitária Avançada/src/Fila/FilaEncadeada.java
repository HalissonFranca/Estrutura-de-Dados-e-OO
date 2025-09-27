package Fila;

import Model.Paciente;

public class FilaEncadeada {
    private static class No {
        Paciente paciente;
        No proximo;

        No(Paciente paciente) {
            this.paciente = paciente;
            this.proximo = null;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;

    public FilaEncadeada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void adicionar(Paciente paciente) {
        No n = new No(paciente);
        if (estaVazia()) {
            inicio = fim = n;
        } else {
            fim.proximo = n;
            fim = n;
        }
        tamanho++;
    }

    public Paciente remover() {
        if (estaVazia()) {
            throw new RuntimeException("A fila esta vazia");
        }
        Paciente paciente = inicio.paciente;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return paciente;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int tamanho() {
        return tamanho;
    }

    public Paciente peek() {
        if (estaVazia()) {
            throw new RuntimeException("A fila esta vazia!");
        }
        return inicio.paciente;
    }
}
