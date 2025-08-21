package UML9;

public class Funcionario {
    private String nome;
    private float salario;
    private int numeroFilhos;

    public Funcionario(String nome, float salario, int numeroFilhos) {
        this.nome = nome;
        this.salario = salario;
        this.numeroFilhos = numeroFilhos;
    }

    public double calcularAumento(double percentual) {
        return salario += salario * (percentual / 100.0);
    }

    public double calcularINSS(){
        if (salario <= 2545.00){
            return salario * 0.06;
        }else{
            return salario * 0.1;
        }
    }

    public double calcularImpostoRenda(){
        if (salario <= 1903.98){
            return 0.0;
        }else if (salario <= 2826.65){
            return salario * 0.075;
        }else if (salario <= 4664.68){
            return salario * 0.15;
        }else{
            return salario * 0.275;
        }
    }
    public double calcularValorIRPF(double valorImpostoRenda){
        if (numeroFilhos == 0){
            return valorImpostoRenda - 545.00;
        }else{
            return valorImpostoRenda * (numeroFilhos * 545.00);
        }
    }
}
