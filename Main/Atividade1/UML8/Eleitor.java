package UML8;

public class Eleitor {
    private String nome;
    private int anoNascimento;

    public Eleitor(String nome, int anoNascimento){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public void CalcularTipoEleitor(){
        double idade = 2025 - anoNascimento;
        System.out.println("Idade: " + idade);
        if (idade < 16){
            System.out.println("Não Eleitor");
        }else if(idade < 18) {
            System.out.println("Eleitor Facultativo");
        }else if (idade <= 65){
            System.out.println("Eleitor Obrigatório");
        }else if (idade > 65){
            System.out.println("Eleitor Facultativo");
        }
    }
}
