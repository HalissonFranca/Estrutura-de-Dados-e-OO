public class Aluno {

    private String ra;
    private String nome;
    private String curso;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Aluno(String ra, String nome, String curso, String telefone, String email, Endereco endereco) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
