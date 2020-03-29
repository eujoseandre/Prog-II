package Aula02;

public class CaixaBanco {
    static private int numCliente;
    private int numCaixa;
    
    public void abreCaixa(int n){
        numCaixa = n;
        numCliente = 0;
        System.out.println("Caixa " + numCaixa + " iniciou operação.");
    }
    
    public void iniciaAtendimento(){
        numCliente = numCliente + 1;
        System.out.print("Cliente com a senha número " + numCliente + ", favor");
        System.out.println(" dirigir-se ao caixa número " + numCaixa + ".");
    }
}
