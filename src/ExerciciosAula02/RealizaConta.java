package ExerciciosAula03;

public class RealizaConta {
    private int numerador;
    private int dividendo;
    
    public int getSoma(){
        return this.numerador + this.dividendo;
    }
    
    public int getSubtracao(){
        return this.numerador - this.dividendo;
    }
    
    public int getDivisao(){
        return this.numerador / this.dividendo;
    }
    
    public int getMultiplicacao(){
        return this.numerador * this.dividendo;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }
    

}
