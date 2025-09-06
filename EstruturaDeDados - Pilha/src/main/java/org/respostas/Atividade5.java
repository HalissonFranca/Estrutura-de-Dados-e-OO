package org.respostas;

import org.dominio.Pilha;
import org.dominio.PilhaEncadeada;
import java.util.Scanner;

public class Atividade5{
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);
        System.out.println("Digite a expressão matematica: ");
        String expressao = dado.nextLine();

        PilhaEncadeada pilha = new PilhaEncadeada();
        boolean balanceado = true;

        for (int i = 0; i < expressao.length(); i++){
            char c = expressao.charAt(i);

            if (c == '('){
                pilha.adicionar(c);
            }
            else if (c == ')'){
                if (pilha.estaVazia()){
                    balanceado = false;
                    break;
                }
                pilha.remover();
            }
        }

        if (!pilha.estaVazia()){
            balanceado = false;
        }

        if (balanceado){
            System.out.println("Expressão valida balenceado");
        } else{
            System.out.println("Expressão invalida desbalanceado");
        }

        dado.close();
    }
}
