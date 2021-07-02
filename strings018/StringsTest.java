package br.com.maratonajava.java.core.strings018;


public class StringsTest {
    //Strings sao imutaveis
    public static void main(String[] args) {


    String nome = "thayna ";
    String nome2 = new String("Catarina "); //1cria uma variavel de referencia, 2um objeto do tipo String, 3 cria uma String no pool de Strings

    String teste1 ="Apollo";
    String teste2 = "Mel";

        System.out.println(teste1.charAt(2));//pra saber o caractere de determinada posicao
        System.out.println(teste1.equals(teste2));  // compara as strings
        System.out.println(teste1.equalsIgnoreCase(teste2)); //compara duas strings e ignora se ta maiuscula ou menuscula
        System.out.println(teste1.length()); //pra ver o tamanho da string
        System.out.println(teste1.replace('A', 'm'));
        System.out.println(teste2.substring(0,2));
        System.out.println(teste1.trim()); //remove os espacos em branco da string
        System.out.println(" A B C D E F G ".toLowerCase()); //deixa tudo maiusculo

        System.out.println("Aula de Java".split(" "));
        System.out.println("Aula".concat(" de Java")); //concatena
        System.out.println("1234 asda qw".replaceAll("[0-9]","#"));
        System.out.println("A e T u i O U Y g w c ".equalsIgnoreCase("thayna"));
        System.out.println("A e T u i O U Y g w c ".toLowerCase()); //deixa tudo menusculo
        System.out.println("A e T u i O U Y g w c ".toUpperCase()); // deixa tudo maiusculo

    }
}
