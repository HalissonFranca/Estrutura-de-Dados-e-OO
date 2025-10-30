public class Supervisor extends Funcionario {
    public boolean approveRenewal(RegistroEmprestimo lr) {
        // lógica simples: aprova sempre (exemplo). Pode checar histórico/atrasos.
        return true;
    }
}

