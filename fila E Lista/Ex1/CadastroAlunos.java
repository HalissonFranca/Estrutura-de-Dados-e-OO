package Ex1;

import java.util.ArrayList;
import java.util.List;

public class CadastroAlunos {
    protected List<Alunos> alunos = new ArrayList<>();

    public void cadastrar(Alunos aluno) {
        if (aluno != null) {
            alunos.add(aluno);
            System.out.println("Aluno cadastrado: " + aluno.getNome());
        } else {
            System.out.println("Erro: aluno nulo não pode ser cadastrado.");
        }
    }

    public void listarTodos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        int c = 0;
        for (Alunos a : alunos) {
            System.out.println("Aluno " + c + ": " + a);
            c++;
        }
    }

    public void pesquisar(int matricula) {
        boolean encontrado = false;
        for (Alunos a : alunos) {
            if (a.getMatricula() == matricula) {
                System.out.println("Aluno encontrado: " + a);
                a.toString();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public void remover(int matricula) {
        boolean removido = false;
        for (int i = 0; i < alunos.size(); i++) {
            Alunos a = alunos.get(i);
            if (a.getMatricula() == matricula) {
                alunos.remove(i);
                System.out.println("Aluno removido: " + a);
                removido = true;
                break;
            }
        }

        if (!removido) {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }
}

