package Main;

import Fila.FilaDePacientes;
import Model.ListaAtendidos;
import Model.Paciente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FilaDePacientes filaPacientes = new FilaDePacientes(5);
        ListaAtendidos listaAtendidos = new ListaAtendidos();
        boolean rodando = true;
        Scanner dado = new Scanner(System.in);

        while (rodando) {
            System.out.println("\n0 - SAIR");
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Atender paciente");
            System.out.println("3 - Mostrar o paciente seguinte");
            System.out.println("4 - Mostrar pacientes atendidos");
            System.out.println("5 - Pesquisar paciente individualmente  atendido");
            System.out.print("\tDigite uma das opçãoes: ");
            int opcao = dado.nextInt();

            switch (opcao) {
                case (0):
                    rodando = false;
                    break;

                case (1):
                    System.out.println("Adicionando o paciente.");
                    System.out.print("Nome: ");
                    String nome = dado.next();

                    Paciente paciente = new Paciente(nome, 21);
                    filaPacientes.adicionar(paciente);
                    System.out.println("Paciente adicionado a fila: " + paciente);
                    break;

                case (2):
                    Paciente atendido;
                    atendido = filaPacientes.remover();
                    listaAtendidos.Cadastrar(atendido);
                    System.out.println("Paciente atendido");
                    break;

                case (3):
                    System.out.println("Paciente seguinte: " + filaPacientes.peek());
                    break;

                case (4):
                    System.out.println("Pacientes atendidos: " + listaAtendidos.ListarTodos());
                    break;

                case (5):
                    System.out.print("Informe o nome para pesquisar o paciente: ");
                    String pesquisarNome = dado.next();
                    System.out.println(listaAtendidos.Pesquisar(pesquisarNome));
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}