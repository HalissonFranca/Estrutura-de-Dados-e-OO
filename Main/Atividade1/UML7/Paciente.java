package UML7;

public class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double CalcularIMC(){
        return peso/(altura*altura);
    }
    public void CalcularFaixaPeso(double IMC){
        if(IMC < 20){
            System.out.println("Faixa peso ideal");
        }else if(IMC < 25){
            System.out.println("Faixa peso normal");
        }else if(IMC < 30){
            System.out.println("Excesso de peso");
        }else if(IMC < 35){
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade mórbida");
        }
    }

}
