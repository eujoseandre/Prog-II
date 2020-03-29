package ExerciciosVetoresEArquivos;

public class Vetor2 {
    private int [] vetor;
    
    public int [] pares(int [] vetor){
        
        int count = 0;
        int tamanho = 0;

    //  Ordenando de forma crescente o vetor - BubbleSort
        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

    //  Pegando a quantidade de números pares
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
                tamanho++;
            }
        }
        int [] pares = new int [tamanho];

    //  Atribuindo os números pares em um vetor
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0){
               pares[count] = vetor[i];
               count++;
            }
        }
        return pares;
    }
}
