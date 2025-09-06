package org.dominio.interfaces;

public interface IEstruturaChar {
    // Interface que define o contrato de uma Estrutura de Dados
    void adicionar(char valor);  // Insere um elemento
    char remover();              // Remove e retorna um elemento
    int tamanho();              // Retorna o número de elementos
    boolean estaVazia();        // Verifica se está vazia
}
