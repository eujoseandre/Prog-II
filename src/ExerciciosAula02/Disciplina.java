package ExerciciosAula03;

public class Disciplina {
    private String name = "André";
    private int cargaHoraria = 8;
    private String nomeProfessor = "Gustavo Rissetti";

    public String getName() {
        return name;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
}
