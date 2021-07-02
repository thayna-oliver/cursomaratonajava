package br.com.maratonajava.java.core.heranca08.classes;

public class Funcionario<nome> extends Pessoa {
    private double salario;


    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
        imprimeRecidoDePagamento();
    }

    public void imprimeRecidoDePagamento(){
        System.out.println("Eu "+super.nome+" recebi o pagamento de "+this.salario);



    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
