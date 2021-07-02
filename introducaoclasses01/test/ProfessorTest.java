package br.com.maratonajava.java.core.introducaoclasses01.test;

import br.com.maratonajava.java.core.introducaoclasses01.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "thayna";
        professor.matricula = 1237;
        professor.cpf = "1324838749";
        professor.rg = 65428272;

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);
    }
}
