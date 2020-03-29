package Vetores_E_Arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    private BufferedWriter bw;
    private BufferedReader br;
    
    public void ler(){
        try {
            br = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = null;
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao abrir arquivo para leitura.");
            e.printStackTrace();
        }
    }
    
    public void gravar(String frase){
        try {
            bw = new BufferedWriter(new FileWriter("arquivo.txt"));
            bw.write(frase);
            bw.close();
            System.out.println("A frase: '" + frase + "' foi gravada no arquivo.");
        } catch (IOException e){
            System.out.println("Erro ao criar arquivo para gravação.");
            e.printStackTrace();
        }  
    }
}
