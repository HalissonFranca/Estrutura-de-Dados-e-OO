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
            if (listaPaciente.get(i).getIdade() == numero) {
                listaPaciente.remove(i);
                System.out.println("Paciente removido");
                return;
            }
        }
        System.out.println("Paciente não cadastrado.");
    }

    public int contarPacientes() {
        return listaPaciente.size();
    }

    public double mediaIdade() {
        if (listaPaciente.isEmpty()) {
            throw new RuntimeException("Lista vazia!");
        }
        int soma = 0;
        for (Paciente p : listaPaciente) {
            soma += p.getIdade();
        }
        return (double) soma / listaPaciente.size();
    }

    public Paciente maisIdoso() {
        if (listaPaciente.isEmpty()) {
            throw new RuntimeException("Lista vazia!");
        }
        Paciente maisvelho = listaPaciente.get(0);
        for (Paciente p : listaPaciente) {
            if (p.getIdade() > maisvelho.getIdade()) {
                maisvelho = p;
            }
        }
        return maisvelho;
    }

    public void relatorioFinal() {
        System.out.println("\n==Relatório Final==");
        System.out.println("Quantidade de pacientes atendidos: " + contarPacientes());
        System.out.println("Média das idades dos pacientes atendidos: " + mediaIdade());
        System.out.println("Paciente mais idoso: " + maisIdoso());
    }

}