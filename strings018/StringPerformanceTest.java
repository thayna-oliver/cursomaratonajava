package br.com.maratonajava.java.core.strings018;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto string "+ (fim-inicio) + "ms");

         inicio = System.currentTimeMillis();
        concatString(10000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto Stringbilder  "+ (fim-inicio) + "ms");

    }

    private static void concatString (int tam) {
        String string = "";
        for (int i = 0; i < tam; i++) {
            string += i ;
        }
    }
    private static void concatStringBilder (int tam) {
        StringBuilder ab = new StringBuilder();
        for (int i = 0; i < tam; i++) {
            ab.append(i);
        }
    }
}



