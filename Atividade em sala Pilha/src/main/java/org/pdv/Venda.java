package org.pdv;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<ItemVenda> itens;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int qtd) {
        itens.add(new ItemVenda(produto, qtd));
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemVenda::getSubtotal).sum();
    }

    public void imprimirCupom() {
        System.out.println("----- CUPOM FISCAL -----");
        for (ItemVenda item : itens) {
            System.out.println(item);
        }
        System.out.println("TOTAL: R$ " + calcularTotal());
        System.out.println("------------------------");
    }
}
