package ExerciciosAula03;

import java.util.Scanner;

public class RestauranteCaseiro {
    
    static MesaDeRestaurante mesa1 = new MesaDeRestaurante();
   
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Refeição: ");
        mesa1.setRefeicao(entrada.nextInt());
        System.out.print("Sobremesa: ");
        mesa1.setSobremesa(entrada.nextInt());
        System.out.print("Refri 2L: ");
        mesa1.setRefri2L(entrada.nextInt());
        System.out.print("Refri 600ML: ");
        mesa1.setRefri600(entrada.nextInt());
        System.out.print("Refri Lata: ");
        mesa1.setRefriLata(entrada.nextInt());
        System.out.print("Cerveja: ");
        mesa1.setCerveja(entrada.nextInt());
        
        System.out.print("Adicionar mais itens ao pedido? S/N: ");
        String r = (entrada.next()).toUpperCase();
            if(r.equals("S")){
                adicionaPedido();
            }
            
        System.out.print("Zera pedido? S/N: ");
        String a = (entrada.next()).toUpperCase();
            if (a.equals("S")){
                mesa1.zeraPedidos();
            }
        System.out.println("Total: " + mesa1.calculaTotal());
    }
    
    public static void adicionaPedido(){
        int array [] = new int [6];
        System.out.print("Refeição: ");
        array[0] = entrada.nextInt();
        System.out.print("Sobremesa: ");
        array[1] = entrada.nextInt();
        System.out.print("Refri 2L: ");
        array[2] = entrada.nextInt();
        System.out.print("Refri 600ML: ");
        array[3] = entrada.nextInt();
        System.out.print("Refri Lata: ");
        array[4] = entrada.nextInt();
        System.out.print("Cerveja: ");
        array[5] = entrada.nextInt();
        mesa1.adicionaAoPedido(array);
    }
}
