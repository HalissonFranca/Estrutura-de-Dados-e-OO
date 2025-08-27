package Class;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
            super(nome, salario);
        }
    
        @Override
    public void aumentaSalario() {
        double salario = this.getSalario() * 0.1;
        //System.out.println("Salario gerente aumentado em 10%: " + salarioComAumento);
    }
    
}
