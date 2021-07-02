package br.com.maratonajava.java.core.associacao07.test;

import br.com.maratonajava.java.core.associacao07.classes.Aluno;
import br.com.maratonajava.java.core.associacao07.classes.Local;
import br.com.maratonajava.java.core.associacao07.classes.Professor;
import br.com.maratonajava.java.core.associacao07.classes.Seminario;

public class associacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Thayna Oliveira " , 25);
        Aluno aluno2 = new Aluno("Mel Maria " , 03);

        Seminario sem = new Seminario(" DevDojo maratona java");
        Professor prof = new Professor("Apollo","usar a forca para programar");
        Local local = new Local("Rua quipapa","Olinda");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[] {aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminario(semArray);

        sem.print();
        prof.print();
    }

}
