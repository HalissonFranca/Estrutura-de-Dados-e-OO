package org.respostas;

import org.dominio.Pilha;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Pilha pilha = new Pilha(10);

        System.out.println("Digite DESFAZER para desfazer o ultimo elemento");
        System.out.println("Digite SAIR para encerrar");

        while (true) {
            System.out.print("Digite um comando: ");
            String entrada = dado.nextLine().trim().toUpperCase();

            if (entrada.equals("SAIR")) break;

            if (entrada.equals("DESFAZER")) {
                if (!pilha.estaVazia()) {
                    System.out.println("Comando desfeito: " + pilha.remover());
                } else {
                    System.out.println("Nenhum comando para desfazer.");
                }
            } else {
                try{
                    int comando = Integer.parseInt(entrada);
                    System.out.println("Comando armazenado: " + entrada);
                    pilha.adicionar(comando);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada invalida! Digite um numero, Desfazer ou Sair");
                }
            }
        }
        dado.close();
    }
}
