package Aula02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Carro uno = new Carro();
        Carro celta = new Carro();
        
        System.out.print("Marca do Carro: ");
        celta.setMarca(entrada.next());
        
        System.out.print("Modelo do Carro: ");
        celta.setModelo(entrada.next());
        
        System.out.print("Ano de Fabricação do " + celta.getModelo() + ": ");
        celta.setAnoFabricacao(entrada.nextInt());  
        celta.imprimir();
        
        System.out.print("Marca do Uno: ");
        uno.setMarca(entrada.next());
        
        System.out.print("Modelo do Uno");
        uno.setModelo(entrada.next());
        
        System.out.print("Ano de Fabricação do " + uno.getModelo() + ": ");
        uno.setAnoFabricacao(entrada.nextInt()); 
        uno.imprimir();
    }
}
