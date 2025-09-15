package org.ed;

import org.ed.interfaces.IEstruturaDeDados;

// Implementação de uma Fila (FIFO - First In, First Out)
public class Fila implements IEstruturaDeDados {
    private int[] elementos; // Array para armazenar os valores
    private int inicio; // Índice do primeiro elemento
    private int fim; // Índice da última posição válida
    private int tamanho; // Quantidade de elementos na fila

    public Fila(int capacidade) {
        this.elementos = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanho = 0;
    }

    // Insere um novo valor no final da fila (enqueue)
    @Override
    public void adicionar(int valor) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("A fila está cheia!");
        }
        fim++;
        elementos[fim] = valor;
        tamanho++;
    }

    // Remove o valor do início da fila e o retorna (dequeue)
    @Override
    public char remover() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia!");
        }
        int valor = elementos[inicio];
        // desloca os elementos para frente
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        fim--;
        tamanho--;
        return (char) valor;
    }

    // Retorna o tamanho atual da fila
    @Override
    public int tamanho() {
        return tamanho;
    }

    // Verifica se a fila está vazia
    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Consulta o elemento na frente da fila sem removê-lo
    public int peek() {
        if (estaVazia()) {
            throw new RuntimeException("A fila está vazia!");
        }
        return elementos[inicio];
    }
}