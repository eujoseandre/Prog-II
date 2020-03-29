package ExerciciosVetoresEArquivos;

import java.util.Arrays;
import java.util.Scanner;

public class MainEx01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetor[] = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor da posição " + i + " do Vetor: ");
            vetor[i] = input.nextInt();
        }
        System.out.println("\nEscolha o método de ordenação\n");
        System.out.print("'1' para Crescente ou '2' para Descrescente: ");
        int resposta = input.nextInt();

        VetorEx01 vet = new VetorEx01();
        
        switch (resposta) {
            case 1:
                System.out.println(Arrays.toString(vet.ordenaCrescente(vetor)));
                break;
            case 2:
                System.out.println(Arrays.toString(vet.ordenaDescrescente(vetor)));
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
