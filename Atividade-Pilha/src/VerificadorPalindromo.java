import java.text.Normalizer;

public class VerificadorPalindromo {


    public static boolean ehPalindromo(String palavra){
        String limpa = palavra;

        if(limpa.length() <= 1) return true;

        Pilha pilha = new Pilha(limpa.length());

        for(int i = 0; i < limpa.length(); i++){
            pilha.adicionar(limpa.charAt(i));
        }

        StringBuilder invertida = new StringBuilder(limpa.length());
        while (!pilha.estaVazia()) {
            int codigo = pilha.remover();
            invertida.append((char) codigo);
        }
        return limpa.equals(invertida.toString());
    }
}
