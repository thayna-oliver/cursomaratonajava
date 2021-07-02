package br.com.maratonajava.java.core.exception015.checkedexcepion.test;

import java.io.File;
import java.io.IOException;

//checked (checado) sempre obrigado a criar um tipo de tratamento para a execao
// unchecked (nao checado) normalmente sao erros de logica

public class CheckedExcepionTest {
    public static void main(String[] args)  {
        abrirArquivo();

    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.File");
        try {
            System.out.println("Arquivo criado? : " + file.createNewFile());
            System.out.println("Arquivo criado ");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;

        }
    }

    public static void abrirArquivo() {

        try {
            System.out.println("Abrindo um arquivo  ");
            System.out.println("execultando a leitura ");
            System.out.println("escrevendo no artigo ");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechar aquivo");
        }
    }
}
