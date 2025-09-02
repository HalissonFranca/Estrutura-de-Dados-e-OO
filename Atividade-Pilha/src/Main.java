import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String entrada = dado.nextLine();

        boolean pala = VerificadorPalindromo.ehPalindromo(entrada);
        System.out.println(pala ? "E palindramo" : "Não e palindromo: ");

        String[] ex = {
                "arara",
                "osso",
                "casa"
        };

        for(String e: ex){
            System.out.printf("\"%s\" -> %s%n", e, VerificadorPalindromo.ehPalindromo(e) ? "palíndromo" : "não");
        }
    }
}
