Package Class;

class Pistoleiro extends Personagem {

    public Pistoleiro(String nome) {
        super(nome);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com sua pistola!");
    }

    public void atirar() {
        System.out.println(nome + " dispara um tiro certeiro!");
    }
}

