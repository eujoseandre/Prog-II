package Primeiro_Trabalho;

import java.util.Scanner;

public class MainPonto {
    public static void main(String[] args) {

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Cordenadas P1\n");
        System.out.print("X: ");
        p1.setX(Double.parseDouble(entrada.nextLine()));
        System.out.print("Y: ");
        p1.setY(Double.parseDouble(entrada.nextLine()));
        
        System.out.println("\nCordenadas P2\n");
        System.out.print("X: ");
        p2.setX(Double.parseDouble(entrada.nextLine()));
        System.out.print("Y: ");
        p2.setY(Double.parseDouble(entrada.nextLine()));
        
        System.out.println("\nP1: " + p1);
        System.out.println("P2: " + p2);
        
        System.out.println("\nDistância ente P1 e P2: " + p1.getDistance(p2));

    }
}