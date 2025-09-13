import java.util.Scanner;

public class CadastroAlunos {
    protected Alunos[] alunos = new Alunos[100]; // vetor com 100 posições
    protected int count = 0;

    public void cadastrar(Alunos aluno) {
        if (count < alunos.length) {
            alunos[count++] = aluno;
            System.out.println("Aluno cadastrado");
        } else {
            System.out.println("Erro no cadastro");
        }
    }

    public void listarTodos() {
        for (Alunos a : alunos) {
            int c = 0;
            System.out.println("Aluno " + " c" + a.toString());
            c++;
        }
    }

}
