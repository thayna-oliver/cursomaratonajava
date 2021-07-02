package br.com.maratonajava.java.core.classesabstratas012.classes;

public class Gerente extends Funcionario {
    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (salario * 0.20);

    }
}
