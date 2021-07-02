package br.com.maratonajava.java.core.blocosdeinicializacao05.classes;

public class Cliente {
    // 1- alocado espaco na memoria para o objeto que sera criado
    // 2- cada atributo de classe e criado e inicializado com seus valores defaut ou valires explicitos
    // 3- bloco de inicializacao e execultado
    // 4- o construtor e execultado
    private int[] parcelas ;
    {
        parcelas = new int [100];
        System.out.println( "Dentro do bloco de inicializacao");
        for (int i = 1; i<=100; i++){
            parcelas[i -1] = i;
        }
    }

    public Cliente() {
        
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}