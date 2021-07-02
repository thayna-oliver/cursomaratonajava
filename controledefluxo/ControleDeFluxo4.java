package br.com.maratonajava.introducao.controledefluxo;

public class ControleDeFluxo4 {
    public static void main(String[] args) {
        //while, do whille, for
        // estruturas de repeticao
        int contador = 11;
        while (contador < 10) {
            System.out.println(++contador);
        }
        contador = 0;
        do {
            System.out.println("dentro do do while ");
        } while (contador < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("o valor de i e:" + i);
            if (i == 5) {
                break;
            }

        }
    }
}
