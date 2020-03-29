
package Aula01;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    
    //Método construtor
    public Pessoa(String nome, String sobrenome, int idade, double altura) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
    }
    
    //Método construtor vázio
    public Pessoa(){
        
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Sobrenome: " + this.sobrenome + "\n");
    }
}
