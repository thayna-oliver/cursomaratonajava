package br.com.maratonajava.java.core.polimorfismo014.test;

import br.com.maratonajava.java.core.polimorfismo014.classes.Funcionario;
import br.com.maratonajava.java.core.polimorfismo014.classes.Gerente;
import br.com.maratonajava.java.core.polimorfismo014.classes.RelatorioPagamento;
import br.com.maratonajava.java.core.polimorfismo014.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Joao ", 5000, 2000);
        Vendedor v = new Vendedor("Maria ", 2000, 20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("-----------------------------");
        relatorio.relatorioPagamentoGenerico(v);

//        Funcionario f = g;
//        System.out.println("#######################");
//        System.out.println(f.getSalario());

    }
}
