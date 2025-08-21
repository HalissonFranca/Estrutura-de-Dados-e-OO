package UML3;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void CalcularPerimetroEArea(){
        if (comprimento < 0 || largura < 0){
            System.out.println("Valor do Comprimento e Largura não pode ser negativo");
        }else{
            double area = comprimento * largura;
            double perimetro = (largura * 4);
            System.out.println("Perimetro: " + perimetro);
            System.out.println("Area: " + area);
        }

    }
}
