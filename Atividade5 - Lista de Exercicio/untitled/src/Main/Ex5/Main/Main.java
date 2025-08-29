package Main.Ex5.Main;

import Main.EX1.Class.Passageiro;
import Main.EX2.Class.CentralDeInformacoes;
import Main.EX3.Class.Persistencia;
import Main.Ex5.Class.Corrida;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CentralDeInformacoes central;
        Persistencia persistencia = new Persistencia();
        String arquivo = "central.txt";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        central = persistencia.recuperarCentral(arquivo);

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n MENU ");
            System.out.println("1 - Novo passageiro");
            System.out.println("2 - Listar todos os passageiros");
            System.out.println("3 - Exibir informações de um passageiro específico");
            System.out.println("4 - Nova corrida");
            System.out.println("5 - Listar todas as corridas");
            System.out.println("6 - Listar corridas de um passageiro");
            System.out.println("S - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao.toUpperCase()) {
                case "1":
                    try {
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();

                        System.out.print("Sexo: ");
                        String sexo = scanner.nextLine();

                        System.out.print("Data de nascimento (dd/MM/yyyy): ");
                        Date dataNascimento = sdf.parse(scanner.nextLine());

                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        Passageiro p = new Passageiro(sexo, nome, dataNascimento, email);

                        if (central.adicionarPassageiro(p)) {
                            System.out.println("Passageiro adicionado com sucesso!");

                            persistencia.salvarCentral(central, arquivo);
                        } else {
                            System.out.println("Falha ao adicionar passageiro!");
                        }

                    } catch (Exception e) {
                        System.out.println("Erro ao ler dados: " + e.getMessage());
                    }
                    break;

                case "2":
                    if (central.getTodosOsPassageiros().isEmpty()) {
                        System.out.println("Nenhum passageiro cadastrado.");
                    } else {
                        System.out.println(" Lista de Passageiros ");
                        int i = 1;
                        for (Passageiro p : central.getTodosOsPassageiros()) {
                            System.out.println(i + " - " + p.getNome() + " (" + p.getEmail() + ")");
                            i++;
                        }
                    }
                    break;

                case "3":
                    System.out.print("Digite o email do passageiro: ");
                    String emailBusca = scanner.nextLine();
                    Passageiro encontrado = central.recuperarPassageiroPeloEmail(emailBusca);
                    if (encontrado != null) {
                        System.out.println("Nome: " + encontrado.getNome());
                        System.out.println("Sexo: " + encontrado.getSexo());
                        System.out.println("Data de nascimento: " + sdf.format(encontrado.getDataNascimento()));
                        System.out.println("Email: " + encontrado.getEmail());
                    } else {
                        System.out.println("Passageiro não encontrado!");
                    }
                    break;

                case "4": // Nova corrida
                    System.out.print("Email do passageiro: ");
                    String emailPassageiro = scanner.nextLine();
                    Passageiro passageiro = central.recuperarPassageiroPeloEmail(emailPassageiro);
                    if (passageiro != null) {
                        System.out.print("Endereço de partida: ");
                        String partida = scanner.nextLine();
                        System.out.print("Endereço de destino: ");
                        String destino = scanner.nextLine();

                        Corrida corrida = new Corrida(partida, destino, passageiro);
                        if (central.adicionarCorrida(corrida)) {
                            System.out.println("Corrida adicionada com sucesso!");
                            persistencia.salvarCentral(central, arquivo);
                        } else {
                            System.out.println("Erro: corrida com mesmo ID já existe!");
                        }
                    } else {
                        System.out.println("Passageiro não encontrado!");
                    }
                    break;

                case "5":
                    if (central.getTodasAsCorridas().isEmpty()) {
                        System.out.println("Nenhuma corrida cadastrada.");
                    } else {
                        System.out.println(" Lista de Corridas ");
                        for (Corrida c : central.getTodasAsCorridas()) {
                            System.out.println("ID: " + c.getId() + " - " + c.toString());
                        }
                    }
                    break;

                case "6":
                    System.out.print("Email do passageiro: ");
                    String emailBuscaCorridas = scanner.nextLine();
                    ArrayList<Corrida> corridasDoPassageiro = central.recuperarCorridasDeUmPassageiro(emailBuscaCorridas);
                    if (corridasDoPassageiro == null) {
                        System.out.println("Passageiro não existe!");
                    } else if (corridasDoPassageiro.isEmpty()) {
                        System.out.println("Este passageiro não possui corridas cadastradas.");
                    } else {
                        System.out.println(" Corridas do passageiro ");
                        for (Corrida c : corridasDoPassageiro) {
                            System.out.println("ID: " + c.getId() + " - " + c.toString());
                        }
                    }
                    break;

                case "S":
                    rodando = false;
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
