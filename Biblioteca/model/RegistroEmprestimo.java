import java.time.LocalDate;
import java.util.List;

public class RegistroEmprestimo {
    private String id;
    private Aluno aluno;
    private List<Livro> livros;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Funcionario funcionario;
    private boolean renovada;
    private boolean devolvido;

    public RegistroEmprestimo(String id, Aluno aluno, List<Livro> livros, LocalDate dataEmprestimo, LocalDate dataDevolucao, Funcionario funcionario, boolean renovada, boolean devolvido) {
        this.id = id;
        this.aluno = aluno;
        this.livros = livros;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.funcionario = funcionario;
        this.renovada = renovada;
        this.devolvido = devolvido;
    }

    public RegistroEmprestimo() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Livro> getBooks() {
        return livros;
    }

    public void setLivros(List<Livro> books) {
        this.livros = books;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public boolean isRenovada() {
        return renovada;
    }

    public void setRenovada(boolean renovada) {
        this.renovada = renovada;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }
}
