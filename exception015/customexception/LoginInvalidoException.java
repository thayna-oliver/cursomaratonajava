package br.com.maratonajava.java.core.exception015.customexception;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException(){
        super("Usuario ou senha invalidos ");
    }
}
