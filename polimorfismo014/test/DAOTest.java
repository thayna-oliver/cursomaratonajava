package br.com.maratonajava.java.core.polimorfismo014.test;

import br.com.maratonajava.java.core.polimorfismo014.classes.ArquivoDAOImpl;

public class DAOTest {

    public static void main(String[] args) {
        ArquivoDAOImpl arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
    }
}