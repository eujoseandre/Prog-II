package ExerciciosVetoresEArquivos;

public class VetorEx02 {
    private int [] vetor;
    
    public int [] pares(int [] vetor){
        
        int count = 0;
        int tamanho = 0;
 
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                tamanho++;
            }
        }
        int [] pares = new int [tamanho];
        
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
               pares[count] = vetor[i];
               count++;
            }
        }
        return pares;
    }
}
