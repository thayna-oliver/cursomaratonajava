package br.com.maratonajava.java.core.modificadorestatico06.classes;

public class Carro {
    // velocidade limite deve ser 240km/h
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime (){
        System.out.println("---------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);

    }

    public Carro (){

    }

    public static void SetVelocidadeLimite (double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;

    }

    public static double getVelocidadeLimite (){
    return velocidadeLimite;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}