package Fila;

import Model.Paciente;

public class FilaEncadeadaUrgente {
    private static class No {
        Paciente paciente;
        No proximo;

        No(Paciente paciente) {
            this.paciente = paciente;
        }
    }

    private No inicio;
    private No fim;
    private int tamanho;
    private boolean urgente;

    public FilaEncadeadaUrgente() {
        inicio = null;
        fim = null;
        tamanho = 0;
        urgente = false;
    }

    public void adicionar(Paciente paciente, boolean urgente) {
        No n = new No(paciente);

        if (estaVazia()) {
            inicio = fim = n;
        } else if (urgente || paciente.getIdade() > 60) {
            n.proximo = inicio;
            inicio = n;
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

    public boolean urgente(boolean u) {
        if (u == true) {
            return true;
        } else {
            return false;
        }
    }
}
