public abstract class Paciente {
    private String nome;
    private int idade;


    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    public abstract String toString();
}
