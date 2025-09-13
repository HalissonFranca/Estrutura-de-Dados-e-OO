package Ex2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Contato> fila = new LinkedList<>();
        int opcao;

        do {
            System.out.println("\n=== Call Center ===");
            System.out.println("1 - Inserir Contato");
            System.out.println("2 - Próximo Contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha a opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    Contato contato = new Contato(nome, telefone, email);
                    fila.add(contato);
                    System.out.println("Contato adicionado à fila.");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("Fila vazia! Nenhum contato para chamar.");
                    } else {
                        Contato proximo = fila.poll();
                        System.out.println("Próximo contato:");
                        System.out.println(proximo);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
