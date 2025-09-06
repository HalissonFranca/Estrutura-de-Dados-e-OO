package org.respostas;

import org.dominio.Pilha;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Pilha historico = new Pilha(10); // capacidade inicial de 10

        System.out.println("Digite um número para acessar um site");
        System.out.println("Digite VOLTAR para retornar ao site anterior");
        System.out.println("Digite SAIR para encerrar");

        while (true) {
            System.out.print("Digite o número do site: ");
            String entrada = dado.nextLine().trim().toUpperCase();

            if (entrada.equals("SAIR")) {
                System.out.println("Encerrando o navegador...");
                break;
            } else if (entrada.equals("VOLTAR")) {
                if (!historico.estaVazia()) {
                    int siteRemovido = historico.remover();
                    System.out.println("Voltando... (Saiu do site " + siteRemovido + ")");
                    if (!historico.estaVazia()) {
                        System.out.println("Agora você está no site " + historico.peek());
                    } else {
                        System.out.println("Histórico vazio. Nenhum site aberto.");
                    }
                } else {
                    System.out.println("Histórico vazio. Não é possível voltar.");
                }
            } else {
                try {
                    int site = Integer.parseInt(entrada);
                    historico.adicionar(site);
                    System.out.println("Acessou o site " + site);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um número, VOLTAR ou SAIR.");
                }
            }
        }

        dado.close();
    }
}