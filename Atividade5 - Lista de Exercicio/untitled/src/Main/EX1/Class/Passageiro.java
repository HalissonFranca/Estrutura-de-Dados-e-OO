package Main.EX1.Class;

import java.util.Date;

public class Passageiro {
    private String sexo;
    private String nome;
    private Date dataNascimento;
    private String email;

    public Passageiro(String sexo, String nome, Date dataNascimento, String email) {
        this.sexo = sexo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
