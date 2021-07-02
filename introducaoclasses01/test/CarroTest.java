package br.com.maratonajava.java.core.introducaoclasses01.test;

import br.com.maratonajava.java.core.introducaoclasses01.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "fusca";
        carro.placa = "KHG1020";
        carro.velocidadeMaxima = 120f;

        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);

    }


}
