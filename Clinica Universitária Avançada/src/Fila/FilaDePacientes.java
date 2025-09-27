package Fila;

import Model.Paciente;

// Implementação de uma Fila (FIFO - First In, First Out)
public class FilaDePacientes {
    private Paciente[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaDePacientes(int capacidade) {
        this.elementos = new Paciente[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    public void adicionar(Paciente paciente) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("A fila está cheia!");
        }
        fim++;
        elementos[fim] = paciente;
        tamanho++;
    }

    public Paciente remover() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia!");
        }
        Paciente paciente = elementos[inicio];

        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fim--;
        tamanho--;
        return paciente;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public Paciente peek() {
        if (estaVazia()) {
            System.out.println("A fila está vazia!");
        }
        return elementos[inicio];
    }
}