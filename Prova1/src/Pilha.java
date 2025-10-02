public class Pilha implements IEstrutura{

    private int topo;
    private int tamanho;
    private Paciente[] elementos;

    public Pilha(int capacidade) {
        elementos = new Paciente[capacidade];
        topo = -1;
        tamanho = 0;
    }

    @Override
    public void adicionar(Paciente p) {
        if (tamanho == elementos.length -1){
            throw  new RuntimeException("Pilha cheia");
        }

        elementos[++topo] = p;
        tamanho++;
    }

    @Override
    public Paciente remover() {
        if (estavazia()){
            throw  new RuntimeException("Pilha vazia");
        }
        Paciente p = elementos[topo];
        tamanho--;
        elementos[topo--];
        return p;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public Paciente peek() {
        return elementos[topo];
    }

    @Override
    public boolean estavazia() {
        return tamanho == -1;
    }
}
