package br.com.maratonajava.java.core.classesabstratas012.test;

import br.com.maratonajava.java.core.classesabstratas012.classes.Funcionario;
import br.com.maratonajava.java.core.classesabstratas012.classes.Gerente;
import br.com.maratonajava.java.core.classesabstratas012.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {

        Gerente g = new Gerente("Anna ", "122234-56", 2000);
        Vendedor v = new Vendedor("Maria", "283638-09", 1500, 5000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println("---------------------------");
        System.out.println(v);
    }



}
