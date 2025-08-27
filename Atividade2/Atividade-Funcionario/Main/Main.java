package Main;
import Class.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Funcionario g = new Gerente("Halisson", 1500);
        Funcionario p = new Gerente("Gabriel", 2300);

        System.out.println("\n1-Dados Grente\n2-Dados Programador\nDigite um dos números para imrimir os dados: ");
        int dados = dado.nextInt();

        if(dados == 1){
            System.out.println(g.getNome());
            System.out.println(g.getSalario());
        }else if(dados == 2){
            System.out.println(p.getNome());
            System.out.println(p.getSalario());
        }else{
            System.out.println("Opção invalida");
        }
        
        System.out.println("\n1 para o Gerente\n2 para o Programador\nAumento de salario: ");
        int dados1 = dado.nextInt();

        if(dados1 == 1){
            g.aumentaSalario();
            System.out.println("Salario aumentado de Gerente: " + g.getSalario());
        }else if(dados1 == 2){
            p.aumentaSalario();
            System.out.println("Salario aumentado de Programador: " + p.getSalario());
        }else{
            System.out.println("Opção invalida");
        }

    }

}
