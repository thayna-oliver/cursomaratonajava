package br.com.maratonajava.introducao.controledefluxo;

public class ExercicioControleDeFluxo2 {
    public static void main(String[] args) {
        //criar um switch que dado o valor de 1 a 7
        //consederando 1 domingo imprima de e ultil ou final de semana

        byte dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo - Fim de semana");
                break;
            case 2:
                System.out.println("Segunda - Dia Ultil");
                break;
            case 3:
                System.out.println("Terca - Dia Ultil");
                break;
            case 4:
                System.out.println("Quarta - Dia Ultil");
                break;
            case 5:
                System.out.println("Quinta - Dia Ultil");
                break;
            case 6:
                System.out.println("Sexta - Dia Ultil");
                break;
            case 7:
                System.out.println("Sabado - Fim de semana");
                break;
        }

    }

}
   /* byte dia = 1;
      switch (dia){
           case 1:
           case 7:
            System.out.println(" Fim de semana");
            break;
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
            System.out.println(" Dia Ultil ");
            break;
          default:
                System.out.println("Opcao invalida");

          */