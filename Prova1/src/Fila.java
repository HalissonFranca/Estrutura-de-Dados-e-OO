public class Fila implements IEstrutura{

    private int inicio;
    private int fim;
    private int tamanho;
    private Paciente[] elementos;

    public Fila(int capacidade) {
        elementos = new Paciente[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    @Override
    public void adicionar(Paciente p) {
        if (tamanho == elementos.length -1){
            throw new RuntimeException("Fila esta cheia");
        }
        fim++;
        elementos[fim] = p;
        tamanho++;
    }

    @Override
    public Paciente remover() {
        if (estavazia()){
            throw new RuntimeException("Fila esta vazia");
        }
        Paciente p = elementos[inicio];
        for (int i = 0; i < tamanho -1; i++){
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        inicio--;
        return p;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public Paciente peek() {
        return elementos[inicio];
    }

    @Override
    public boolean estavazia() {
        if (tamanho == -1) {
            return true;
        }else{
            return false;
        }
    }
}
