
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroAlunos cd = new CadastroAlunos();
        Alunos aluno = new Alunos();
        int quebra = 1;

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (quebra == 1) {
            System.out.println("Nome: ");
            aluno.setNome(sc.nextLine());

            System.out.println("Matricula: ");
            aluno.setMatricula(sc.nextInt());

            System.out.println("Data de Nascimento: ");
            aluno.setDataNascimento(sc.nextLine());
        }

    }
}
