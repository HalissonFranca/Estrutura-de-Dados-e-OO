package EX1;

public class Pessoa{
    private final String nome;
    private final double peso;
    private final double altura;
    private final String sexo;
    
    public Pessoa(String nome, double peso, double altura, String sexo){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public void CalcularIMC(){
        double imc = peso / (altura * altura);
        System.out.println("IMC de " + nome + " e " + imc);
    }
}