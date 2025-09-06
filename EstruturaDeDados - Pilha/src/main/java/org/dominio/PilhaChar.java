package org.dominio;

import org.dominio.interfaces.IEstruturaChar;

// Implementação de uma Pilha (LIFO - Last In, First Out)
public class PilhaChar implements IEstruturaChar {
    private char[] elementos; // Array para armazenar os valores char
    private int topo;         // Indica a posição do último elemento inserido

    public PilhaChar(int capacidade) { // 10
        this.elementos = new char[capacidade];
        this.topo = -1; // Pilha vazia
    }

    // Insere um novo valor no topo da pilha
    @Override
    public void adicionar(char valor) {
        if (topo == elementos.length - 1) {
            throw new RuntimeException("A pilha está cheia!");
        }
        elementos[++topo] = valor;
    }

    // Remove o valor do topo da pilha e o retorna
    public char remover() { // pop()
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return elementos[topo--];
    }

    // Retorna o tamanho atual da pilha
    @Override
    public int tamanho() {
        return topo + 1;
    }

    // Verifica se a pilha está vazia
    @Override
    public boolean estaVazia() {
        return topo == -1;
    }

    public String getTexto() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= topo; i++) {
            sb.append(elementos[i]);
        }
        return sb.toString();
    }
}