package br.com.maratonajava.java.core.enum011.test;

import br.com.maratonajava.java.core.enum011.classes.Cliente;
import br.com.maratonajava.java.core.enum011.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Thayna", TipoCliente.PESSOA_FISICA );
        System.out.println( cliente);

        Cliente cliente1 = new Cliente("Mel", TipoCliente.PESSOA_JURIDICA );
        System.out.println(cliente1);

    }
}
