package br.com.maratonajava.java.core.sobrecargametodos03.test;

import br.com.maratonajava.java.core.sobrecargametodos03.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("mel", "123.456.456-00", 4500, "900.700.12");
        Funcionario funcionario2 = new Funcionario();

//        funcionario.setNome("Mel");
//        funcionario.setCpf("123.456.567-00");
//        funcionario.setSalario(4500);

        funcionario.imprime();
        funcionario2.imprime();

 

    }
}
