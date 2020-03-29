package Verifica_Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Triangulo triangulo = new Triangulo();
        System.out.print("Lado 1: ");
        triangulo.setLado1(entrada.nextDouble());
        System.out.print("Lado 2: ");
        triangulo.setLado2(entrada.nextDouble());
        System.out.print("Lado 3: ");
        triangulo.setLado3(entrada.nextDouble());
        System.out.println(triangulo.getType());
        triangulo.getType();
        
    }
}
