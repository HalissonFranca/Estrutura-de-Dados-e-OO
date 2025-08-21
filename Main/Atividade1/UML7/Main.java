package UML7;

public class Main {
    public static void main(String[] args) {
        Paciente pc = new Paciente("Claiton", 75, 1.8);

        System.out.println("IMC: " + pc.CalcularIMC());
        pc.CalcularFaixaPeso(pc.CalcularIMC());
    }
}
