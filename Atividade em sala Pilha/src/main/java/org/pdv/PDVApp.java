package org.pdv;

import org.ed.Fila;
import org.ed.Pilha;

public class PDVApp {
    public static void main(String[] args) {
        // Criando produtos
        Produto p1 = new Produto(1, "Arroz 5kg", 25.0);
        Produto p2 = new Produto(2, "Feijão 1kg", 8.0);
        Produto p3 = new Produto(3, "Refrigerante 2L", 10.0);

        // Fila de clientes (capacidade 5)
        Fila fila = new Fila(5);
        fila.adicionar(1); // ID cliente 1 (Maria)
        fila.adicionar(2); // ID cliente 2 (João)
        fila.adicionar(3); // ID cliente 3 (Ana)

        // Pilha de operações (capacidade 10)
        Pilha pilha = new Pilha(10);

        // Atendimento dos clientes
        while (!fila.estaVazia()) {
            int idCliente = fila.remover();
            Cliente cliente = switch (idCliente) {
                case 1 -> new Cliente("Maria");
                case 2 -> new Cliente("João");
                case 3 -> new Cliente("Ana");
                default -> new Cliente("Cliente Desconhecido");
            };

            System.out.println("\nAtendendo " + cliente);

            Venda venda = new Venda();
            venda.adicionarItem(p1, 2);
            pilha.adicionar('A'); // Marca operação: adicionar Arroz
            System.out.println("Operação registrada: Adicionado 2x " + p1.getNome());

            venda.adicionarItem(p3, 1);
            pilha.adicionar('B'); // Marca operação: adicionar Refri
            System.out.println("Operação registrada: Adicionado 1x " + p3.getNome());

            venda.imprimirCupom();

            // Exemplo de desfazer última operação
            char ultimaOperacao = pilha.remover();
            System.out.println("Desfazendo última operação registrada: " + ultimaOperacao);
        }
    }
}
