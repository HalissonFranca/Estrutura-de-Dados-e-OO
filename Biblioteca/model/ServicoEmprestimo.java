import java.time.LocalDate;
import java.util.*;

public class ServicoEmprestimo {
    private DadosBiblioteca data;
    private int loanIdSeq = 1;
    private int defaultDays = 14;

    public ServicoEmprestimo(DadosBiblioteca data) {
        this.data = data;
    }

    public RegistroEmprestimo createLoan(String ra, List<String> isbns, Funcionario funcionario) {
        Aluno s = data.alunoPorRA.get(ra);
        if (s == null) throw new IllegalArgumentException("Aluno não cadastrado");

        List<Livro> toLoan = new ArrayList<>();
        for (String isbn : isbns) {
            Livro b = data.livroporIsbn.get(isbn);
            if (b == null) throw new IllegalArgumentException("Livro não encontrado: " + isbn);
            if (!b.emprestrar()) throw new IllegalStateException("Sem exemplares disponíveis: " + b.getTitulo());
            toLoan.add(b);
        }
        RegistroEmprestimo lr = new RegistroEmprestimo();
        lr.setId("L" + (loanIdSeq++));
        lr.setAluno(s);
        lr.setLivros(toLoan);
        lr.setDataEmprestimo(LocalDate.now());
        lr.setDataDevolucao(LocalDate.now().plusDays(defaultDays));
        lr.setFuncionario(funcionario);
        data.emprestimoPorRA.computeIfAbsent(ra, k -> new ArrayList<>()).add(lr);
        return lr;
    }

    public void retornarLivro(String loanId) {
        // procura o loan e marca devolvido; empilha livros para conferência
        for (List<RegistroEmprestimo> list : data.emprestimoPorRA.values()) {
            for (RegistroEmprestimo lr : list) {
                if (lr.getId().equals(loanId) && !lr.isDevolvido()) {
                    for (Livro b : lr.getBooks()) data.returnStack.push(b);
                    lr.setDevolvido(true); // já devolvido (aguardando conferência)
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Empréstimo não encontrado");
    }

    public void inspecionarERintregar() {
        while (!data.returnStack.isEmpty()) {
            Livro b = data.returnStack.pop();
            b.devolucao();
            // registrar histórico se quiser
        }
    }

    public List<RegistroEmprestimo> encontrarAtrasado() {
        List<RegistroEmprestimo> overdue = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (List<RegistroEmprestimo> list : data.emprestimoPorRA.values()) {
            for (RegistroEmprestimo lr : list) {
                if (!lr.isDevolvido() && lr.getDataDevolucao().isBefore(today)) overdue.add(lr);
            }
        }
        return overdue;
    }

    public boolean solicitacaoRenovacao(String loanId, Supervisor supervisor) {
        // se padrão de dias for excedido, requer aprovação do supervisor
        for (List<RegistroEmprestimo> list : data.emprestimoPorRA.values()) {
            for (RegistroEmprestimo lr : list) {
                if (lr.getId().equals(loanId)) {
                    if (lr.isDevolvido()) return false; // já renovado
                    boolean approved = supervisor.approveRenewal(lr);
                    if (approved) {
                        lr.setDataDevolucao(lr.getDataDevolucao().plusDays(defaultDays));
                        lr.setDevolvido(true);
                        return true;
                    } else return false;
                }
            }
        }
        return false;
    }
}

