package br.com.maratonajava.java.core.introducaometodos02.classe;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (notas != null)
            for (double nota : notas) {
                System.out.print(nota + "   ");
            }

    }

    public void tirarMedia() {
        if (notas == null) {
            System.out.println("Esse aluno nao possui notas");
            return;
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;

        }
        media = media / notas.length;

        if (media > 6) {
            this.aprovado = true;
            System.out.println("Aprovado");
            return;
        }
        this.aprovado = false;
        System.out.println("Reprovado");
    }

    //getters ands setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("idade invalida");
            return;
        }
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    //   public void setAprovado(boolean aprovado){
    //       this.aprovado = aprovado;
    //  }

    public boolean isAprovado() { //para valores booleanos usar "is" = isAprovado
        return this.aprovado;

    }

}



