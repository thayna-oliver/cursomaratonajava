package br.com.maratonajava.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int [5];
        int [] numeros1 = {1,2,3,4,5}; //tam5 index de 0 ate 4
        int [] numeros2 = new int[] {1,2,3,4,5,};

//        for(int i =0 ; i<numeros2.length; i++){
//            System.out.println(numeros2[i]);
//        }

        for(int aux : numeros2){
            System.out.println( aux );
        }

    }
}
