package Class;

class Sniper extends Pistoleiro {

    public Sniper(String nome) {
        super(nome);
    }

    public void mira() {
        System.out.println(nome + " está mirando com precisão...");
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com um tiro de sniper!");
    }
}