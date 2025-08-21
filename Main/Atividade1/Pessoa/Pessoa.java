package Pessoa;

public class Pessoa{
    private String nome;
    private double peso;
    private double altura;
    private String sexo;
    
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