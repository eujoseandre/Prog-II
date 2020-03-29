package ExerciciosAula02;

public class Veiculo {
    private String marca;
    private String modelo;
    private double preco = 1250.00;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String toString(){
        return " alugou o veiculo "+ this.marca + " no modelo "+ this.modelo + ". "
                + "O preço total ficou por " + this.preco;
    }
    
}
