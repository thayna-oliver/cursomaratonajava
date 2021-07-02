package br.com.maratonajava.java.core.blocosdeinicializacao05.test;

import br.com.maratonajava.java.core.blocosdeinicializacao05.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println( "exibindo a quantidade de parcelas possiveis" );
        for (int parcelas : c.getParcelas()){
            System.out.print( parcelas + " ");
        }

    }

}


