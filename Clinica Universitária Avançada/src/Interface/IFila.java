package Interface;

import Model.Paciente;

public interface IFila {
    void adicionar(Paciente paciente);

    Paciente remover();

    Paciente peek();

    boolean estaVazia();

    int tamanho();
}