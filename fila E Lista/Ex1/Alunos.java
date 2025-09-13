package Ex1;

public class Alunos {
    private String nome;
    private int matricula;
    private String dataNascimento;

    public Alunos(String nome, int matricula, String dataNascimento) {
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
        return "Nome: " + nome + " | Matrícula: " + matricula + " | Nasc: " + dataNascimento;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
