package UML4;

public class Paralelepipado {
    private double comprimento;
    private double largura;
    private double altura;

    public Paralelepipado(double comprimento, double largura, double altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    public void CalcularAreaEVolume(){
        double area = (2 * (altura * largura + altura * comprimento +  largura * comprimento));
        double volume = altura * comprimento * largura;
        System.out.println("Area: " + area + "cm²");
        System.out.println("Volume: " + volume + "cm³");
    }
}
