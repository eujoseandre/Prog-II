package ExerciciosAula03;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        RealizaConta conta = new RealizaConta();
        
        System.out.print("Valor 1: ");
        conta.setNumerador(entrada.nextInt());
        
        System.out.print("Valor 2: ");
        conta.setDividendo(entrada.nextInt());
        
        System.out.println("\nResultado:\n");
        System.out.println("Soma: " + conta.getSoma());
        System.out.println("Subtração: " + conta.getSubtracao());
        System.out.println("Divisão: " + conta.getDivisao());
        System.out.println("Multiplicação: " + conta.getMultiplicacao());
    }
}
