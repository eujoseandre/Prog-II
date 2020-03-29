package ExerciciosVetoresEArquivos;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[8];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Valor da posição " + i + ": ");
            vetor[i] = entrada.nextInt();
        }
        Vetor2 vet = new Vetor2();
        System.out.println(Arrays.toString(vet.pares(vetor)));
    }
}
