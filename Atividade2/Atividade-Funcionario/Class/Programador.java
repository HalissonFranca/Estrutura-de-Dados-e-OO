package Class;

public class Programador extends Funcionario{

    public Programador(String nome, double salario) {
            super(nome, salario);
        }
    
        @Override
    public void aumentaSalario() {
        double salarioComAumento = this.getSalario() * 0.2;
        //System.out.println("Salario programador aumentado em 20%: " + salarioComAumento);
    }
    
}