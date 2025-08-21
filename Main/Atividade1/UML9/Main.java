package UML9;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Halisson", 4750, 0);

        System.out.println("Salario Após Aumento: " + funcionario.calcularAumento(30));
        System.out.println("INSS: " + funcionario.calcularINSS());
        System.out.println("Imposto de Renda: " + funcionario.calcularImpostoRenda());
        System.out.println("Valor do IRPF: " + funcionario.calcularValorIRPF(funcionario.calcularImpostoRenda()));

    }
}
