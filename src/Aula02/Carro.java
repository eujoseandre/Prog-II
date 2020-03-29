package Aula02;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String toString(){
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno de Fabricação: " + this.anoFabricacao;
    }
    
}
