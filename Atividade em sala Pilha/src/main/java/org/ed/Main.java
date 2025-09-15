package org.ed;

import java.util.Scanner;

// Classe principal para testar a Pilha
public class Main {
    public static void main(String[] args) {
        // Testes iniciais
        /*Pilha pilha = new Pilha(5);

        System.out.println("Adicionando elementos...");
        pilha.adicionar(10);
        pilha.adicionar(20);
        pilha.adicionar(30);
        pilha.adicionar(40);

        System.out.println("Topo da pilha: " + pilha.peek()); // 30
        System.out.println("Tamanho da pilha: " + pilha.tamanho()); // 3

        System.out.println("Removendo elemento: " + pilha.remover()); // 30
        System.out.println("Topo atual: " + pilha.peek()); // 20
        */

        // problemas encontrados:
        // - conversão de valor
        //

        // Stack<String> teste = new Stack<String>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra para inverter:");
        String palavra = sc.nextLine();

        Pilha pilha = new Pilha(palavra.length());

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

        if (palavra.equals(invertida)) {
            System.out.println("Palíndromo identificado!");
        } else {
            System.out.println("Palíndromo não identificado!");
        }

        sc.close();
    }
}
