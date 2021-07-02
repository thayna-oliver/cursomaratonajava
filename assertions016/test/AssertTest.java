package br.com.maratonajava.java.core.assertions016.test;

public class AssertTest {
    public static void main(String[] args) {
        diasDaSemana(9);

    }

    private static void calculaSalario(double salario) {
        assert (salario > 0); //assert nao utilizar em metodos publicos pq qlqr um pode fazer a chamada do metodo

//        if (salario > 0) {
//            //fazer calculo com salario
//        } else {
//            System.out.println("se chegou ate aqui, ferrou!"); //esse else nao deveria existir
//        }
    }
    public static void diasDaSemana (int dia){
        switch (dia){
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            default: assert false;
        }
    }
}