package br.com.maratonajava.java.core.introducaometodos02.test;

import br.com.maratonajava.java.core.introducaometodos02.classe.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);

        System.out.println("divisao de dois numeros");
        System.out.println(calc.divideDisNumeros(20,2));

        System.out.println( "impreimindo dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20,5);

        System.out.println("continuando....");

        int [] numeros = {1, 2, 3, 4, 5 };
        calc.somaArray(numeros);

        calc.somaVarArgs(1,2,3,4,5);
    }

}
