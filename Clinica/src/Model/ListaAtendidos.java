package Model;
import java.util.ArrayList;
import java.util.List;


public class ListaAtendidos {
    public List<Paciente> listaPaciente = new ArrayList<>();

    public void Cadastrar(Paciente paciente) {
        listaPaciente.add(paciente);
    }

    public List<Paciente> ListarTodos() {
        return listaPaciente;
    }

    public Paciente Pesquisar(String nome) {
        for (Paciente p : listaPaciente) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        System.out.println("Paciente foi achado.");
        return null;
    }

    public void Remover(int numero) {
        for (int i = 0; i < listaPaciente.size(); i++) {
            if (listaPaciente.get(i).getNumero() == numero) {
                listaPaciente.remove(i);
                System.out.println("Paciente removido");
                return;
            }
        }
        System.out.println("Paciente não cadastrado.");
    }
}