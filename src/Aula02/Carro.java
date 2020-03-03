package Aula02;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    
   /* public Carro (String marca, String modelo, int anoFabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }
    public Carro (){
        
    }
*/
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
    public void imprimir(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.anoFabricacao);
        System.out.println("\n");
    }
}
