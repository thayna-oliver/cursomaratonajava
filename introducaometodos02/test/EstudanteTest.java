package br.com.maratonajava.java.core.introducaometodos02.test;

import br.com.maratonajava.java.core.introducaometodos02.classe.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
       Estudante estudante = new Estudante ();
       estudante.setNome("Thayna Oliveira");
       estudante.setIdade(-1);
       estudante.setNotas(new double[] {7, 8, 9.5 });
       estudante.print();
       estudante.tirarMedia();
        System.out.println("aprovado? " +estudante.isAprovado());

    }
}
