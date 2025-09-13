import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alunos {
    private String nome;
    private int matricula;
    private LocalDate dataNascimento;

    public Alunos(String nome, int matricula, LocalDate dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
    }

    public Alunos() {
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + nome + " | Matrícula: " + matricula + " | Nasc: " + dataNascimento.format(fmt);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
