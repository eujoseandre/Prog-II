package ExerciciosAula02;

import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        Cliente andre = new Cliente();
        Veiculo uno = new Veiculo();
        
        System.out.print("Nome do cliente: ");
        andre.setNome(entrada.next());
        System.out.print(andre.getNome() + ", digite seu CPF: ");
        andre.setCpf(entrada.next());
        System.out.print(andre.getNome()+", digite seu email: ");
        andre.setEmail(entrada.next());
        
        System.out.print(andre.getNome() + " digite a marca do veiculo: ");
        uno.setMarca(entrada.next());
        System.out.print("Modelo: ");
        uno.setModelo(entrada.next());
        
        
        
    }
}
