package UML2;

public class Esfera {
    private double raio;
    private double areaTotal;
    private double volume;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public void calcularArea(){
        if (raio < 0){
            System.out.println("O valor do raio não pode ser negativo");
        }else{
            areaTotal = (4 * 3.1415 * (raio * raio));
            volume = ((4/3) * 3.1415 * (raio * raio * raio));
            System.out.println("Area total: " +  areaTotal + "c²");
            System.out.println("Volume: " + volume + "cm³");
        }
    }
}
