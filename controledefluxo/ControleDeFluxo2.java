package br.com.maratonajava.introducao.controledefluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        //operador ternario

        int idade = 20;
        String status;

        status = idade < 18 ? "nao adulto" : "adulto";
        System.out.println(status);

    }
}
