package EX7;

public class Cone {
    private final double raio;
    private final double altura;

    public  Cone(double raio,  double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public void CalcularGeratrizAreaLateralAreaTotalVolume(){
        if (raio < 0 || altura < 0){
            System.out.println("Raio e Altura não pode ser negativo");
        }else{
            double geratriz = Math.sqrt((altura * altura) + (raio * raio));
            double areaLateral = (3.1415 * raio * geratriz);
            double areaTotal = (3.1415 * raio * (geratriz + raio));
            double volume = (1.0 / 3.0 * 3.1415 * (raio * raio) * altura);

            System.out.println("Geratriz: " + geratriz);
            System.out.println("AreaLateral: " + areaLateral + "cm²");
            System.out.println("AreaTotal: " + areaTotal + "cm²");
            System.out.println("Volume: " + volume + "cm³");
        }
    }
}
