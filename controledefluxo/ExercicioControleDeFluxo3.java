package br.com.maratonajava.introducao.controledefluxo;

public class ExercicioControleDeFluxo3 {
    public static void main(String[] args) {
        //imprimir todos os numeros pares de 0 ate 100000

        for (int i = 0; i < 10000; i++) {
            System.out.println( i++ );
            if (i == 10000) {
                break;
            }
        }
    }
}