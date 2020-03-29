package Vetores_E_Arquivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Gerenciamento {
    private static int vetor[];
    
    public static void main() { //Add o String[] para usar esse como met. principal
        vetor = new int[5];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <vetor.length; i++) {
            System.out.print("Digite a posição " + i + " do vetor: ");
            vetor[i] = entrada.nextInt();
        }
        Vetor vet = new Vetor();       
/*      int vetorPosProcessamento[] = vet.processaConteudo(vetor);
        vet.exibeConteudo(vetorPosProcessamento);                 */
        vet.exibeConteudo(vet.processaConteudo(vetor));
    }
    
    public static void main(String [] args) throws IOException {//Add o String[] para usar esse como met. principal
        BufferedReader entrada;
        entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite uma frase: ");
        String frase = entrada.readLine();
        
        Arquivo minhaFrase = new Arquivo();
        minhaFrase.gravar(frase);
        
        minhaFrase.ler();
    }
}
