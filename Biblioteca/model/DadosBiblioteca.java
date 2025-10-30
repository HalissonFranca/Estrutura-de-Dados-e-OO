import java.util.*;

public class DadosBiblioteca {

    public List<Aluno> alunos = new ArrayList<>();
    public Map<String, Aluno> alunoPorRA = new HashMap<>();

    public List<Livro> livros = new ArrayList<>();
    public Map<String, Livro> livroporIsbn = new HashMap<>();

    public Stack<Livro> returnStack = new Stack<>(); // pilha de conferência
    public Queue<Aluno> attendanceQueue = new LinkedList<>();

    public Map<String, List<RegistroEmprestimo>> emprestimoPorRA = new HashMap<>();
    public Set<String> categorias = new HashSet<>();

    // métodos utilitários de cadastro e busca
    public void adicionarEstudante(Aluno aluno) {
        alunos.add(aluno);
        alunoPorRA.put(aluno.getRa(), aluno);
    }
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        livroporIsbn.put(livro.getIsbn(), livro);
        categorias.add(livro.getCategoria());
    }
}

