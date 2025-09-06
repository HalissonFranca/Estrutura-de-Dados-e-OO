package org.respostas;

import java.util.Scanner;
import java.util.Stack;

import org.dominio.Pilha;
import org.dominio.PilhaEncadeada;

// Classe principal para testar a Pilha
public class Atividade4 {
    public static void main(String[] args) {
        // Testes iniciais
        /*Pilha pilha = new Pilha(5);
*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra para inverter:");
        String palavra = sc.nextLine();

        PilhaEncadeada pilha = new PilhaEncadeada();

        // Empilhar todos os caracteres da palavra
        for (int i = 0; i < palavra.length(); i++) {
            pilha.adicionar(palavra.charAt(i));
        }

        System.out.println("Tamanho da pilha preenchida: " + pilha.tamanho());

        // Desempilhar para formar a palavra invertida
        String invertida = "";
        while (!pilha.estaVazia()) {
            invertida += String.valueOf(pilha.remover()); //corrige a conversão para String
        }

        System.out.println("Tamanho da pilha após desempilhar: " + pilha.tamanho());
        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + invertida);

        sc.close();
    }
}
