package br.com.maratonajava.java.core.wrappers.test;

//pacote017
public class WrappersTest {

    public static void main(String[] args) {
        //tipos primitivos
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shorWrapper = 1;
        Integer integerWrapper = 1;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character characterWrapper = 'A';
        Boolean booleanWrapper = true;

        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);

        System.out.println(Character.isDigit('9')); //diz se e um digito
        System.out.println(Character.isLetter('A')); // se e uma letra
        System.out.println(Character.isLetterOrDigit('@')); // diz se e letra ou digito
        System.out.println(Character.isUpperCase('A')); // diz se a letra e maiuscula
        System.out.println(Character.isLowerCase('a')); // diz se a letra e menuscula
        System.out.println(Character.toUpperCase('a')); // deixa a letra maiuscula


    }
}