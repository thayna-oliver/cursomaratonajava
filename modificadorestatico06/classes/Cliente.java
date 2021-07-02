package br.com.maratonajava.java.core.modificadorestatico06.classes;

public class Cliente {
    // 0- Bloco de inicializacao estatico e excutado qaundo a JVM carrega a classe ( e executado apenas 1 vez )
    // 1- alocado espaco na memoria para o objeto que sera criado
    // 2- cada atributo de classe e criado e inicializado com seus valores defaut ou valires explicitos
    // 3- bloco de inicializacao e execultado
    // 4- o construtor e execultado
    private static int[] parcelas;
    {
        System.out.println("bloco de inicializacao nao estatico");
    }

    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao estatico");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    static {
        System.out.println("Bloco estatico 2 ");
    }

    static {
            System.out.println("Bloco estatico 3 ");
        }
    public Cliente() {

        }

        public static int[] getParcelas () {
            return parcelas;
        }


    }
