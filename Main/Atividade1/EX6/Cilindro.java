package EX6;

public class Cilindro {
    private final double raio;
    private final double altura;

    public  Cilindro(double raio,  double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public void CalcularAreaLAteralEAreaTotalEVolume(){
        if (raio < 0 || altura < 0){
            System.out.println("Raio e Altura não pode ser negativo");
        }else{
            double areaLateral = (2 * 3.1415 * raio * altura);
            double areaTotal = (2 * 3.1415 * raio * (altura + raio));
            double volume = (3.1415 * raio * raio * altura);
            System.out.println("Area Lateral: " + areaLateral + "cm²");
            System.out.println("Area Total: " + areaTotal + "cm²");
            System.out.println("Volume: " + volume + "cm³");
        }
    }
}
