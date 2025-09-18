package Model;

public class Paciente {
    private String nome;
    private int numero;

    public Paciente(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Paciente " + "nome: " + nome + " | numero: " + numero;
    }
}
