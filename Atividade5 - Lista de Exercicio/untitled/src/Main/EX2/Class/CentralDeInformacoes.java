package Main.EX2.Class;

import Main.EX1.Class.Passageiro;
import Main.Ex5.Class.Corrida;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CentralDeInformacoes {
    private ArrayList<Passageiro> todosOsPassageiros;
    private ArrayList<Corrida> todasAsCorridas = new ArrayList<>();

    public CentralDeInformacoes() {
        this.todosOsPassageiros = new ArrayList<>();
    }

    public boolean adicionarCorrida(Corrida c) {
        if (recuperarCorridaPeloId(c.getId()) == null) {
            todasAsCorridas.add(c);
            return true;
        }
        return false;
    }

    public Corrida recuperarCorridaPeloId(long id) {
        for (Corrida c : todasAsCorridas) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Corrida> recuperarCorridasDeUmPassageiro(String email) {
        Passageiro passageiro = recuperarPassageiroPeloEmail(email);
        if (passageiro == null) return null;

        ArrayList<Corrida> resultado = new ArrayList<>();
        for (Corrida c : todasAsCorridas) {
            if (c.getPassageiro().getEmail().equals(email)) {
                resultado.add(c);
            }
        }
        return resultado;
    }


    public boolean adicionarPassageiro(Passageiro p){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataLimite = sdf.parse("01/01/2007");

            if (recuperarPassageiroPeloEmail(p.getEmail()) == null) {

                if (p.getDataNascimento().after(dataLimite)) {
                    System.out.println("Passageiro menor de idade!");
                    return false;
                }
                todosOsPassageiros.add(p);
                return true;
            } else {
                System.out.println("Email já cadastrado!");
                return false;
            }

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }



    public Passageiro recuperarPassageiroPeloEmail(String email){ //retornar passageiros repetidos por email
        for(Passageiro p : todosOsPassageiros){
            if(p.getEmail().equals(email)){
                return p; //Passageiro ja cadastrado com o email
            }
        }
        return null;
    }

    public ArrayList<Corrida> getTodasAsCorridas() {
        return todasAsCorridas;
    }
    public ArrayList<Passageiro> getTodosOsPassageiros() {
        return todosOsPassageiros;
    }

    public void setTodosOsPassageiros(ArrayList<Passageiro> todosOsPassageiros) {
        this.todosOsPassageiros = todosOsPassageiros;
    }
}
