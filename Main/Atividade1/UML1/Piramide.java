package UML1;

public class Piramide {
    private double base;
    private double altura;
    private double volume;

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void CalcularVolume() {
        volume = (1.0 / 3.0) * base * altura;
        System.err.println("O volume e: " + volume + "cm²");
    }
}