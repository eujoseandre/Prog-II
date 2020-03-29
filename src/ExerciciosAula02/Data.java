package ExerciciosAula03;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public void inicializaData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
    }
    
    public boolean vemAntes(Data a){
        if (a.getAno() == this.ano){
            if(a.getMes() < this.mes){
                return true;
            }
            else if (a.getMes() == this.mes){
               if (a.getDia() <= this.dia){
                   return true;
               }
               else return false;
            }
            else return false;
        }
        else if (a.getAno() < this.ano){
            return true;
        }
        else return false;
    }
    
    public boolean dataEValida(int dia, int mes, int ano){
        return this.dia != 0 && this.mes != 0 && this.ano !=0;
    }
    
    public String mostraData(){
        if(dataEValida(this.dia, this.mes, this.ano)){
            return this.dia +"/"+ this.mes +"/"+ this.ano;
        }
        else{
            return "Data Inválida";
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}