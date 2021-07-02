package br.com.maratonajava.java.core.interfaces013.test;


import br.com.maratonajava.java.core.interfaces013.classes.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto( "Notebook", 4 ,3000 );
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);


    }
}
