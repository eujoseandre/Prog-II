package Vetores_E_Arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo2 {

    private BufferedWriter bw;
    private BufferedReader br;
    private String arquivo;

    public Arquivo2(String arquivo) {
        this.arquivo = arquivo;
    }

    public void gravar(String texto) {
        try {
            bw = new BufferedWriter(new FileWriter(this.arquivo + ".txt", true));
            bw.write(texto);
            bw.write("\n");
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro na abertura de arquivo para gravação.");
        }
    }

    public String ler() {
        String conteudo = "";
        String texto = "";
        try {
            br = new BufferedReader(new FileReader(this.arquivo + ".txt"));
            while ((conteudo = br.readLine()) != null) {
                texto = texto + conteudo + "\n";
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro na abertura de arquivo para leitura.");
        }
        return texto;
    }
}
