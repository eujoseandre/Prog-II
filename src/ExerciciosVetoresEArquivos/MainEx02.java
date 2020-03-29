package ExerciciosVetoresEArquivos;

import java.util.Arrays;
import java.util.Scanner;

public class MainEx02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[8];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor: ");
            vetor[i] = entrada.nextInt();
        }
        VetorEx02 vet = new VetorEx02();
        System.out.println(Arrays.toString(vet.pares(vetor)));
    }
}
