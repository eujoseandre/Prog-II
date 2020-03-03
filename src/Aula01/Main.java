package Aula01;

public class Main {

    public static void main(String[] arguments) {

        Pessoa andre = new Pessoa("André", "Souza", 19, 1.70);
        andre.imprimir();

        Pessoa eduardo = new Pessoa();

        eduardo.setNome("Eduardo");
        eduardo.setIdade(19);
        eduardo.setAltura(1.70);
        eduardo.setSobrenome("Weber");
        eduardo.imprimir();

        Pessoa maria = new Pessoa();
        maria.setNome("Maria");
        maria.setSobrenome("Weasley");
        maria.setIdade(25);
        maria.setAltura(1.80);
        maria.imprimir();
    }
}
