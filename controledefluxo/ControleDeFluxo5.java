package br.com.maratonajava.introducao.controledefluxo;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        //dado o valor de um carro descubra em quantas vezes pode ser parcelado
        //porem as parcelas nao poder ser menor que 1000

        double valorTotal = 300000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            if (valorParcela >=1000){
                System.out.println("parcela "+ parcela + " R$ " + valorParcela );
            }
        }

    }
}
