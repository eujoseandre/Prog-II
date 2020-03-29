package ExerciciosAula02;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public String toString(){
        return "O cliente "+ this.nome + " portador(a) do CPF: "+ this.cpf;
    }
}
