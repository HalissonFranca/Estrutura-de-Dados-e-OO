package org.respostas;

import org.ed.Pilha;

import java.util.Scanner;

public class UndoComPilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha(10);

        while (true) {
            System.out.print("Digite um número (ou -1 para DESFAZER / 0 para SAIR): ");
            int entrada = sc.nextInt();

            if (entrada == 0) break;

            if (entrada == -1) {
                if (!pilha.estaVazia()) {
                    System.out.println("Comando desfeito: " + pilha.remover());
                } else {
                    System.out.println("Nenhum comando para desfazer.");
                }
            } else {
                pilha.adicionar(entrada);
                System.out.println("Comando armazenado: " + entrada);
            }
        }
        sc.close();
    }
}