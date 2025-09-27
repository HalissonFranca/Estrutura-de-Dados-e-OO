package Main;

import java.util.Scanner;

import Fila.FilaEncadeada;
import Fila.FilaEncadeadaUrgente;
import Model.ListaAtendidos;
import Model.Paciente;

public class MainPrioridade {
    public static void main(String[] args) {
        FilaEncadeadaUrgente encadeada = new FilaEncadeadaUrgente();
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

                    System.out.print("Paciente Urgente? Digite true ou false");
                    boolean urgente = dado.nextBoolean();

                    Paciente paciente = new Paciente(nome, idade);
                    encadeada.adicionar(paciente, urgente);

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

        encadeada.adicionar(new Paciente("Ana", 25), false); // Normal
        encadeada.adicionar(new Paciente("Carlos", 70), false); // Idoso
        encadeada.adicionar(new Paciente("Maria", 40), true); // Urgente
        encadeada.adicionar(new Paciente("João", 15), false); // Normal
        encadeada.adicionar(new Paciente("Roberta", 80), false); // Idoso
        encadeada.adicionar(new Paciente("Pedro", 50), true); // Urgente
        encadeada.adicionar(new Paciente("Lucas", 30), false); // Normal
        encadeada.adicionar(new Paciente("Fernanda", 65), false);// Idoso
        encadeada.adicionar(new Paciente("Beatriz", 22), true); // Urgente
        encadeada.adicionar(new Paciente("Miguel", 10), false); // Normal

        System.out.println("Ordem de atendimento:");
        while (!encadeada.estaVazia()) {
            System.out.println(encadeada.remover());
        }

        listaAtendidos.relatorioFinal();

    }
}
