package Fila;

import Interface.IFila;
import Model.Paciente;

public class FilaCircular implements IFila {
    private Paciente[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaCircular(int capacidade) {
        elementos = new Paciente[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    @Override
    public void adicionar(Paciente paciente) {
        if (tamanho == elementos.length) {
            throw new UnsupportedOperationException("A fila esta cheia");
        }
        fim = (fim + 1) % elementos.length;
        elementos[fim] = paciente;
        tamanho++;
    }

    @Override
    public Paciente remover() {
        if (estaVazia()) {
            throw new UnsupportedOperationException("A Fila esta vazia");
        }
        Paciente paciente = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return paciente;
    }

    @Override
    public Paciente peek() {
        if (estaVazia()) {
            throw new UnsupportedOperationException("A fila esta vazia!");
        }
        return elementos[inicio];

    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }
}
