package br.com.maratonajava.java.core.modificadorfinal010.classes;

public class Carro {

    private static final double VELOCIDADE_LIMITE = 250;
    private final Comprador COMPRADOR = new Comprador();
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public final void imprime(){
        System.out.println("imprimindo um carro ");
    }

    public static double getVelocidadeLimite() {
        return VELOCIDADE_LIMITE;
    }

    public Comprador getCOMPRADOR() {
        return COMPRADOR;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
