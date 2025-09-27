package Main;

import java.util.Scanner;

import Fila.FilaEncadeada;
import Model.ListaAtendidos;
import Model.Paciente;

public class MainEstatisticaRelatorio {
    public static void main(String[] args) {
        FilaEncadeada encadeada = new FilaEncadeada();
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
            System.out.println("6 - Mostrar quantidade e atendimentos ");
            System.out.println("7 - Media das idades dos pacientes atendidos  e encontrar paciente mais idoso");
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

                    System.out.print("Idade: ");
                    int idade = dado.nextInt();

                    Paciente paciente = new Paciente(nome, idade);
                    encadeada.adicionar(paciente);
                    System.out.println("Paciente adicionado a fila: " + paciente);
                    break;

                case (2):
                    Paciente atendido;
                    atendido = encadeada.remover();
                    listaAtendidos.Cadastrar(atendido);
                    System.out.println("Paciente atendido: " + atendido.toString());
                    break;

                case (3):
                    System.out.println("Paciente seguinte: " + encadeada.peek());
                    break;

                case (4):
                    System.out.println("Pacientes atendidos: " + listaAtendidos.ListarTodos());
                    break;

                case (5):
                    System.out.print("Informe o nome para pesquisar o paciente: ");
                    String pesquisarNome = dado.next();
                    System.out.println(listaAtendidos.Pesquisar(pesquisarNome));
                    break;
                case (6):
                    System.out.println("Quantidade de pacientes atendidos: " + listaAtendidos.contarPacientes());
                    break;

                case (7):
                    System.out.println("Media das idades dos atendidos: " + listaAtendidos.mediaIdade());
                    System.out.println("Paciente mais idoso: " + listaAtendidos.maisIdoso().toString());
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }

        listaAtendidos.relatorioFinal();
    }
}