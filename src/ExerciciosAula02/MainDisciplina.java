package ExerciciosAula03;

import java.util.Scanner;

public class MainDisciplina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Disciplina eduardo = new Disciplina();
        
        System.out.println(eduardo.getName());
        System.out.println(eduardo.getCargaHoraria());
        System.out.println(eduardo.getNomeProfessor());
        
        System.out.print("\nInserir nome do Aluno: ");
        eduardo.setName(input.next());
        
        System.out.print("Carga horária: ");
        eduardo.setCargaHoraria(input.nextInt());
        
        System.out.print("Nome Professor: ");
        eduardo.setNomeProfessor(input.next());
        
        System.out.println("\n" + eduardo.getName());
        System.out.println(eduardo.getCargaHoraria());
        System.out.println(eduardo.getNomeProfessor());
    }
}
