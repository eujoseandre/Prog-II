package ExerciciosAula03;

public class MesaDeRestaurante {
    double precoKgRefeicao = 15.50, precoSobremesa = 7.50, precoRefri2L = 8,
           precoRefri600 = 3.50, precoRefriLata = 5, precoCerveja = 6;
    int refeicao = 0, sobremesa = 0, refri2L = 0, refri600 = 0, refriLata = 0, cerveja = 0;

    public void adicionaAoPedido(int array []){
        this.refeicao += array[0];
        this.sobremesa += array[1];
        this.refri2L += array[2];
        this.refri600 += array[3];
        this.refriLata += array[4];
        this.cerveja += array[5];
    }
    
    public void zeraPedidos(){
        this.refeicao = 0;
        this.sobremesa = 0;
        this.refri2L = 0;
        this.refri600 = 0;
        this.refriLata = 0;
        this.cerveja = 0;
    }
    
    public double calculaTotal(){
        double total = 0;
        total += (refeicao * precoKgRefeicao);
        total += (sobremesa * precoSobremesa);
        total += (refri2L * precoRefri2L);
        total += (refri600 * precoRefri600);
        total += (refriLata * precoRefriLata);
        total += (cerveja * precoCerveja);
        return total;
    }

    public double getPrecoKgRefeicao() {
        return precoKgRefeicao;
    }

    public double getPrecoSobremesa() {
        return precoSobremesa;
    }

    public double getPrecoRefri2L() {
        return precoRefri2L;
    }

    public double getPrecoRefri600() {
        return precoRefri600;
    }

    public double getPrecoRefriLata() {
        return precoRefriLata;
    }

    public double getPrecoCerveja() {
        return precoCerveja;
    }

    public int getRefeicao() {
        return refeicao;
    }

    public int getSobremesa() {
        return sobremesa;
    }

    public int getRefri2L() {
        return refri2L;
    }

    public int getRefri600() {
        return refri600;
    }

    public int getRefriLata() {
        return refriLata;
    }

    public int getCerveja() {
        return cerveja;
    }

    public void setPrecoKgRefeicao(double precoKgRefeicao) {
        this.precoKgRefeicao = precoKgRefeicao;
    }

    public void setPrecoSobremesa(double precoSobremesa) {
        this.precoSobremesa = precoSobremesa;
    }

    public void setPrecoRefri2L(double precoRefri2L) {
        this.precoRefri2L = precoRefri2L;
    }

    public void setPrecoRefri600(double precoRefri600) {
        this.precoRefri600 = precoRefri600;
    }

    public void setPrecoRefriLata(double precoRefriLata) {
        this.precoRefriLata = precoRefriLata;
    }

    public void setPrecoCerveja(double precoCerveja) {
        this.precoCerveja = precoCerveja;
    }

    public void setRefeicao(int refeicao) {
        this.refeicao = refeicao;
    }

    public void setSobremesa(int sobremesa) {
        this.sobremesa = sobremesa;
    }

    public void setRefri2L(int refri2L) {
        this.refri2L = refri2L;
    }

    public void setRefri600(int refri600) {
        this.refri600 = refri600;
    }

    public void setRefriLata(int refriLata) {
        this.refriLata = refriLata;
    }

    public void setCerveja(int cerveja) {
        this.cerveja = cerveja;
    }
    
    
}
