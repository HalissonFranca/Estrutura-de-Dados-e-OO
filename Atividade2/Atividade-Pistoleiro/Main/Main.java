package Main;

public class Main {
    public static void main(String[] args) {
        Personagem p = new Personagem("Lutador");
        p.dizerNome();
        p.atacar();

        Pistoleiro pist = new Pistoleiro("Halisson");
        pist.dizerNome();
        pist.atacar();
        pist.atirar();

        Sniper sn = new Sniper("Adriel");
        sn.dizerNome();
        sn.mira();
        sn.atacar();
    }
}