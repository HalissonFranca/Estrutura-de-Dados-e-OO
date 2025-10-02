public interface IEstrutura {
    void adicionar(Paciente p);
    Paciente remover();
    int tamanho();
    Paciente peek();
    boolean estavazia();
}
