package ExerciciosVetoresEArquivos;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] vetor = new int[4];
        for (int i = 0; i <vetor.length; i++) {
            System.out.print("Valor da posição " + i +": ");
            vetor[i] = entrada.nextInt();
        }
        Vetor3 vet = new Vetor3();
        System.out.println(Arrays.toString(vetor));
        System.out.println(Arrays.toString(vet.toFloat(vetor)));
    }
}
