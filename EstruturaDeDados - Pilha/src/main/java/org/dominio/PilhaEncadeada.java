package org.dominio;

import org.dominio.interfaces.IEstruturaChar;

// Implementação de uma Pilha utilizando Lista Encadeada
public class PilhaEncadeada implements IEstruturaChar {

    // Classe interna para representar cada nó da lista
    private static class Node {
        char valor;
        Node proximo;

        Node(char valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Node topo; // referência para o nó do topo
    private int tamanho; // quantidade de elementos na pilha

    public PilhaEncadeada() {
        this.topo = null;
        this.tamanho = 0;
    }

    // Insere um novo valor no topo da pilha
    @Override
    public void adicionar(char valor) { // push()
        Node novo = new Node(valor);
        novo.proximo = topo; // o próximo do novo nó é o antigo topo
        topo = novo;         // atualiza o topo
        tamanho++;
    }

    // Remove e retorna o valor do topo da pilha
    @Override
    public char remover() { // pop()
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        int valor = topo.valor;
        topo = topo.proximo; // atualiza o topo para o próximo nó
        tamanho--;
        return (char) valor; // mantendo compatibilidade com a interface
    }

    // Retorna o tamanho atual da pilha
    @Override
    public int tamanho() {
        return tamanho;
    }

    // Verifica se a pilha está vazia
    @Override
    public boolean estaVazia() {
        return topo == null;
    }

    // Retorna o elemento do topo sem removê-lo
    public char peek() {
        if (estaVazia()) {
            throw new RuntimeException("A pilha está vazia!");
        }
        return topo.valor;
    }
}
