package br.com.maratonajava.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, long, int, float, double =0
        //char = "   " vazio
        //boolean = false
        // reference = null
        /* int[] idades = new int [3];
        System.out.println("idade 1: " + idades[0] );
        System.out.println("idade 2: " + idades[1] );
        System.out.println("idade 3: " + idades[2] );
      */
        String[] nomes = new String [3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";

        //System.out.println(nomes.length);

        for(int i=0; i<nomes.length; i++){
            System.out.println( nomes[i] );
        }

        nomes = new String[4]; //cria um novo espaco na memoria


    }
}
