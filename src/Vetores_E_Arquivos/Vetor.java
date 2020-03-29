package Vetores_E_Arquivos;

public class Vetor {

    public void exibeConteudo(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    
    public int[] processaConteudo(int vetor []){
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] += 100;
        }
        return vetor;
    }
}
