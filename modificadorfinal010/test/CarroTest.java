package br.com.maratonajava.java.core.modificadorfinal010.test;

import br.com.maratonajava.java.core.modificadorfinal010.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getCOMPRADOR());
        c.getCOMPRADOR() .setNome("nsnsjaj");
        c.getCOMPRADOR() .setNome("Thayna ");
        System.out.println(c.getCOMPRADOR());

    }
}
