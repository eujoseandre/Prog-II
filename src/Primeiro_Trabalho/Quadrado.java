package Primeiro_Trabalho;

public class Quadrado {
    
    private Ponto supEsq;
    private Ponto infDir;
    
    public Quadrado(){}
    
    public Quadrado(Ponto supEsq, Ponto infDir){
        this.supEsq = supEsq;
        this.infDir = infDir;
    }
    
    public boolean isInside(Ponto p){
        if((p.getX() <= this.infDir.getX()) &&
           (p.getX() >= this.supEsq.getX()) &&
           (p.getY() >= this.infDir.getY()) &&
           (p.getY() <= this.supEsq.getY())) {
            return true;
            }
            else{
            return false;
        }
    }
    
    private double getLado(){
        return this.infDir.getX() - this.supEsq.getX();
    }
    
    public double getPerimetro(){
        return this.getLado()*4;
    }
    
    public double getArea(){
        return this.getLado() * this.getLado();
    }
    
    public double getDiagonal(){
        return supEsq.getDistance(infDir);
    }

    public Ponto getSupEsq() {
        return supEsq;
    }

    public Ponto getInfDir() {
        return infDir;
    }

    public void setSupEsq(Ponto supEsq) {
        this.supEsq = supEsq;
    }

    public void setInfDir(Ponto infDir) {
        this.infDir = infDir;
    }
    
    public String toString(){
        return "Ponto Superior Esquerdo: " + this.supEsq +
                "\nPonto Inferior Direito: " + this.infDir;
    }
}
