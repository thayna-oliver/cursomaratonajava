package br.com.maratonajava.java.core.polimorfismo014.classes;

public class DatabaseDAOImpl implements GenericDAO {


    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }
}
