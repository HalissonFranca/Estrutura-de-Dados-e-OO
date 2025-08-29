package Main.EX3.Class;

import Main.EX2.Class.CentralDeInformacoes;
import Main.EX1.Class.Passageiro;
import Main.Ex5.Class.Corrida;

import java.io.*;
import java.util.Date;
import java.util.ArrayList;

public class Persistencia {

    // Salva passageiros e corridas no mesmo arquivo
    public void salvarCentral(CentralDeInformacoes central, String nomeArquivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {

            // Primeiro salva passageiros
            bw.write("[PASSAGEIROS]");
            bw.newLine();
            for (Passageiro p : central.getTodosOsPassageiros()) {
                bw.write(p.getNome() + ";" + p.getSexo() + ";" + p.getEmail() + ";" + p.getDataNascimento().getTime());
                bw.newLine();
            }

            // Depois salva corridas
            bw.write("[CORRIDAS]");
            bw.newLine();
            for (Corrida c : central.getTodasAsCorridas()) {
                bw.write(c.getId() + ";" + c.getEnderecoPartida() + ";" + c.getEnderecoDestino() + ";" + c.getPassageiro().getEmail());
                bw.newLine();
            }

            System.out.println("Central salva em: " + nomeArquivo);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Recupera passageiros e corridas do arquivo
    public CentralDeInformacoes recuperarCentral(String nomeArquivo) {
        CentralDeInformacoes central = new CentralDeInformacoes();
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) return central;

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            boolean lendoPassageiros = false;
            boolean lendoCorridas = false;

            while ((linha = br.readLine()) != null) {
                if (linha.equals("[PASSAGEIROS]")) {
                    lendoPassageiros = true;
                    lendoCorridas = false;
                    continue;
                } else if (linha.equals("[CORRIDAS]")) {
                    lendoPassageiros = false;
                    lendoCorridas = true;
                    continue;
                }

                if (lendoPassageiros) {
                    String[] campos = linha.split(";");
                    if (campos.length < 4) continue;
                    String nome = campos[0];
                    String sexo = campos[1];
                    String email = campos[2];
                    long dataMillis = Long.parseLong(campos[3]);
                    Passageiro p = new Passageiro(sexo, nome, new Date(dataMillis), email);
                    central.adicionarPassageiro(p);
                }

                if (lendoCorridas) {
                    String[] campos = linha.split(";");
                    if (campos.length < 4) continue;
                    long id = Long.parseLong(campos[0]);
                    String partida = campos[1];
                    String destino = campos[2];
                    String emailPassageiro = campos[3];
                    Passageiro passageiro = central.recuperarPassageiroPeloEmail(emailPassageiro);
                    if (passageiro != null) {
                        Corrida c = new Corrida(id, partida, destino, passageiro);
                        central.adicionarCorrida(c); // agora o id é o mesmo do arquivo
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return central;
    }
}
