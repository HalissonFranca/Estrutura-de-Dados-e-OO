package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroAlunos cd = new CadastroAlunos();
        int quebra = 1;
        int opreacao;
        boolean rodando = true;

        while (rodando) {
            System.out.println("=== Operações ===");
            System.out.println("Digite 1 para cadastrar");
            System.out.println("Digite 2 para listar todos");
            System.out.println("Digite 3 para pesquisar");
            System.out.println("Digite 4 para remover");
            System.out.println("Digite 0 para finalizar programa");
            System.out.print("Operação: ");

            opreacao = sc.nextInt();
            sc.nextLine();

            switch (opreacao) {
                case 1:
                    System.out.println("\n=== Operação de cadastro ===");
                    boolean continuarCadastro;
                    do {
                        Alunos aluno = new Alunos();

                        System.out.print("Nome: ");
                        aluno.setNome(sc.nextLine());

                        System.out.print("Matrícula: ");
                        aluno.setMatricula(sc.nextInt());
                        sc.nextLine(); // limpar buffer

                        System.out.print("Data de Nascimento: ");
                        aluno.setDataNascimento(sc.nextLine());

                        cd.cadastrar(aluno);
                        System.out.println("Aluno cadastrado!");

                        System.out.print("Cadastrar outro? (s/n): ");
                        String resp = sc.nextLine().trim().toLowerCase();
                        continuarCadastro = resp.equals("s") || resp.equals("sim");
                    } while (continuarCadastro);
                    break;

                case 2:
                    System.out.println("\n=== Operação de Listar todos ===\n");

                    cd.listarTodos();
                    break;

                case 3:
                    System.out.println("\n=== Pesquisa ===");
                    System.out.println("Digite um número de matrícula para pesquisar: ");
                    int pesquisa = sc.nextInt();
                    cd.pesquisar(pesquisa);
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("\n=== deletar aluno ===");
                    System.out.println("Digite um número e matrícula para deletar: ");
                    int dell = sc.nextInt();
                    cd.remover(dell);
                    break;
                case 0:
                    rodando = false;
                    System.out.println("\nPrograma fechado.");
                    break;
                default:
                    break;
            }

        }
        sc.close();
    }

}
