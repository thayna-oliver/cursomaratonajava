package br.com.maratonajava.introducao.controledefluxo;

public class ControleDeFluxo6 {
    public static void main(String[] args) {
        //dado o valor de um carro descubra em quantas vezes pode ser parcelado
        //porem as parcelas nao poder ser menor que 1000

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela>=1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela <= 1000){
                continue;
            }
            System.out.println("parcela " + parcela );
        }
    }
}
