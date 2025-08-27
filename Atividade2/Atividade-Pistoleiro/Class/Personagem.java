package Class;

class Personagem {
    protected String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public void atacar() {
        System.out.println(nome + " ataca de forma genérica!");
    }

    public void dizerNome() {
        System.out.println("Meu nome é " + nome);
    }
}