package br.com.maratonajava.java.core.introducaometodos02.classe;
//exercicio
//crie os seguintes atributos para essa classe
//nome , matricula , rg , cpf
//crie uma classe de teste para preencher e imprimir os dados desse prefessor

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;


public void imprime (){
    System.out.println("-----------------");
    System.out.println(this.nome);
    System.out.println(this.cpf);
    System.out.println(this.rg);
    System.out.println(this.matricula);
    System.out.println("Nome alterado dentro do imprime");

}
}
