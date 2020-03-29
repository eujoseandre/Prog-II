package Primeiro_Trabalho;

public class MainQuadrado {
    public static void main(String[] args) {
        
        Ponto pSupEsq = new Ponto(2.0, 4.0);
        Ponto pInfDir = new Ponto(5.0, 1.0);
        
        Quadrado quad = new Quadrado(pSupEsq, pInfDir);
        
        System.out.println("Quadrado:\n\n" + quad);
        System.out.println("\nDiagonal: " + quad.getDiagonal());
        System.out.println("\nArea: " + quad.getArea());
        System.out.println("\nPerimetro: " + quad.getPerimetro());
        
        Ponto p = new Ponto(3.9,3.8);
        
        if(quad.isInside(p)){
            System.out.println("\nO ponto " + p + " está dentro do Quadrado");
        }
        else {
            System.out.println("\nO ponto " + p + " está fora do Quadrado");
        }
    }
}
