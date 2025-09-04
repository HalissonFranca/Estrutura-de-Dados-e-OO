package org.respostas;

import org.dominio.Pilha;
import org.dominio.PilhaChar;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        PilhaChar pilha = new PilhaChar(100);

        System.out.println("Disite caracteres para o texto.");
        System.out.println("Disite BACKSPACE para apagar o ultimo caractere.");
        System.out.println("Digite ENTER para finalizar o texto.");

        while(true){
            System.out.print("Entrada: ");
            String entrada = dado.nextLine();

            if(entrada.equalsIgnoreCase("ENTER")){
                System.out.println("Texto final: " + pilha.getTexto());
                break;
            } else if (entrada.equalsIgnoreCase("BACKSPACE")) {
                if(!pilha.estaVazia()){
                    char removido = pilha.remover();
                    System.out.println("Removido: " + removido);
                }else{
                    System.out.println("Não tem nada para se apagar");
                }
            }else{
                for( char c: entrada.toCharArray()){
                    pilha.adicionar(c);
                }
                System.out.println("Texto atual: " + pilha.getTexto());
            }
        }
    }
}