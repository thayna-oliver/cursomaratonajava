package br.com.maratonajava.java.core.sobrescrita009.test;

import br.com.maratonajava.java.core.sobrescrita009.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Thayna");
        p.setIdade(25);
        System.out.println(p);

        Pessoa p1 = new Pessoa();
        p1.setNome("Carly");
        p1.setIdade(32);
        System.out.println(p1);

    }
}
