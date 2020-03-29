
package ExerciciosAula03;

import java.util.Scanner;

public class MainData {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        Data data1 = new Data();
        Data data2 = new Data();
        
        System.out.println("Data 1\n");
        System.out.print("Dia: ");
        data1.setDia(entrada.nextInt());
        
        System.out.print("Mês: ");
        data1.setMes(entrada.nextInt());
        
        System.out.print("Ano: ");
        data1.setAno(entrada.nextInt());
        
        System.out.println("\nData 2\n");
        System.out.print("Dia: ");
        data2.setDia(entrada.nextInt());
        
        System.out.print("Mês: ");
        data2.setMes(entrada.nextInt());
        
        System.out.print("Ano: ");
        data2.setAno(entrada.nextInt());
        
        System.out.println("\n" + data1.mostraData());
        System.out.println(data2.mostraData());
        
        System.out.println("\nValidação: " + data1.vemAntes(data2));
    }
}
