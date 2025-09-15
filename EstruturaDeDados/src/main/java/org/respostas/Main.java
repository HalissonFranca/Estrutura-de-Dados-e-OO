package org.respostas;

import org.ed.PilhaDePratos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PilhaDePratos pp = new PilhaDePratos(10);
        Scanner dado = new Scanner(System.in);
        int saida = 1;
        int operacao;

            

        while (saida != 0) {
            System.out.println("\n\n--Controle de Pratos--");
            System.out.println("Digite 1 para adicionar a quantidade de pratos a pilha");
            System.out.println("Digite 2 para remover da pilha 1 prato");
            System.out.println("Digite 3 para mostrar qual prato esta no topo atualmente");
            System.out.println("Digite 4 para mostrar o estado atual");
            System.out.println("Digite 0 para finalizar o programa");
            System.out.print("Digite o valor da operação: ");
            operacao = dado.nextInt();

            switch (operacao) {
                case 1:
                    System.out.print("Quantos pratos deseja adicionar: ");
                    int pratos = dado.nextInt();
    
                    for(int i=0; i < pratos; i++ ){
                        pp.adicionar(i);
                    }
                    break;
                
                case 2:
                    System.out.print("Quantos Remover o pratos");
                    System.out.println("Prato remvido: " + pp.peek() + "°" +  pp.remover());
                    break;
    
                case 3: 
                    System.out.print("Mostrar o prato que esta no topo apos ser removido");
                    
                    System.out.println("Prato no topo atualmente: " + pp.peek() + "°" );
                    break;
    
                case 4:
                    System.out.print("Estado atual: ");
                    System.out.println(pp.tamanho());
                    break;
    
                case 0:
                    operacao = 0;
                default:
                    break;
            }
            
        }
        
        
        /*System.out.print("Adicionar quantos pratos: ");
        int prato = dado.nextInt();

        System.out.println(pp.tamanho());

        System.out.println("Prato remvido: " + pp.peek() + "°" +  pp.remover());
        System.out.println("Prato remvido: " + pp.peek() + "°" +  pp.remover());
        System.out.println("Prato no topo atualmente: " + pp.peek() + "°" );
        System.out.println("Estado atual da pilha: " + pp.tamanho() + " pratos");*/


        /*O codigo resolve da seguinte forma, a pilha adiciona 5 pratos, sendo o ultimo adicionado e o 
        primeiro a ser removido. Ao receber um prato limpo e colocado no topo da pilha pelo push, e ao
        ser usado o aluno retima utilziado o metodo pop. Essas operações fazem com que seja possivel
        mexer na pilha.*/
    }    
}
