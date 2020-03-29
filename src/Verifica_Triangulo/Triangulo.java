package Verifica_Triangulo;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public void alterar(){
        
    }
    public void retornar() {
        
    }
    public double getPerimetro(){
        return this.lado1  + this.lado2 + this.lado3;
    }
    public String getType(){
        if((this.lado1 == this.lado2) && (this.lado2 == this.lado3)){
            return "Equilátero";
        }
        else if((this.lado1 == this.lado2) || (this.lado2 != this.lado3) || (this.lado1 != this.lado3)){
            return "Isóseles";
        }
        return "Escaleno";
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
}
