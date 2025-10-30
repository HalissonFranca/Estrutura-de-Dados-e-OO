import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO SISTEMA DE BIBLIOTECA ===\n");

        DadosBiblioteca data = new DadosBiblioteca();
        ServicoEmprestimo service = new ServicoEmprestimo(data);
        Editora ed = new Editora("001E","Editora Info");
        System.out.println(" -> Editora cadastrada: " + ed.getNome());

        Funcionario emp = new Funcionario(1,"João");
        System.out.println(" -> Funcionário cadastrado: " + emp.getNome());

        Endereco end = new Endereco("Rua A", "123", "Centro", "Goiânia", "Goias");
        Aluno aluno = new Aluno("20251234", "Maria", "ADS", "9999-0000", "maria@uni.edu", end);
        data.adicionarEstudante(aluno);
        System.out.println(" -> Aluno cadastrado: " + aluno.getNome() + " (" + aluno.getRa() + ")");

        Livro b = new Livro(1,"Computação Cientifica","Halisson",2025,"ISBN-001","Informatica", 10, 2, ed);
        data.adicionarLivro(b);
        System.out.println(" -> Livro cadastrado: " + b.getTitulo() + " | ISBN: " + b.getIsbn());
        System.out.println(" -> Exemplares disponíveis: " + b.getCopiasDiscipiveis());

        System.out.println("\n Realizando empréstimo...");
        RegistroEmprestimo lr = service.createLoan("20251234", Arrays.asList("ISBN-001"), emp);
        System.out.println(" -> Empréstimo criado com sucesso!");
        System.out.println(" -> ID do Empréstimo: " + lr.getId());
        System.out.println(" -> Data de devolução prevista: " + lr.getDataDevolucao());
        System.out.println(" -> Livros emprestados: ");
        for (Livro l : lr.getBooks()) {
            System.out.println("    * " + l.getTitulo() + " (ISBN: " + l.getIsbn() + ")");
        }


        System.out.println("\n Realizando devolução...");
        service.retornarLivro(lr.getId());
        System.out.println(" -> Livros devolvidos e aguardando conferência!");

        System.out.println("\n Inspecionando e reintegrando livros ao acervo...");
        service.inspecionarERintregar();
        System.out.println(" -> Todos os livros foram conferidos e retornaram ao acervo.");

        // Checa o estado final do livro
        System.out.println("\n Verificando disponibilidade final do livro...");
        System.out.println(" -> Quantidade disponível agora: " + b.getCopiasDiscipiveis());

        System.out.println("\n=== FIM ===");
    }
}
