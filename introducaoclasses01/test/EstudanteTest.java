package br.com.maratonajava.java.core.introducaoclasses01.test;

import br.com.maratonajava.java.core.introducaoclasses01.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante Joao = new Estudante();
        Joao.nome = "Joao";
        Joao.matricula = "1212";
        Joao.idade = 15;

        System.out.println(Joao.nome);
        System.out.println(Joao.matricula);
        System.out.println(Joao.idade);
    }

}
