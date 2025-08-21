package EX11;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Halisson", 4750, 0);

        System.out.println("Salario Após Aumento: R$" + funcionario.calcularAumento(30));
        System.out.println("INSS: R$" + funcionario.calcularINSS());
        System.out.println("Imposto de Renda: R$" + funcionario.calcularImpostoRenda());
        System.out.println("Valor do IRPF: R$" + funcionario.calcularValorIRPF(funcionario.calcularImpostoRenda()));

    }
}
