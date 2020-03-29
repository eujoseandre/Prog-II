package ExerciciosVetoresEArquivos;

public class Vetor3 {

    public float [] toFloat(int [] vetor) {

        float[] vet = new float[4];
        for (int i = 0; i < vetor.length; i++) {
            vet[i] = vetor[i];
        }
        for (int i = 0; i < vet.length; i++) {
            vet[i] += 0.5;
        }
        return vet;
    }
}
