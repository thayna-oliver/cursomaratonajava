package br.com.maratonajava.java.core.sobrecargaconstrutores04.test;

import br.com.maratonajava.java.core.sobrecargaconstrutores04.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante ("2424005", "Apollo", new double[] {5, 7, 9}, "20/02/2020" );
        est.imprime();



    }


}
