package br.com.maratonajava.java.core.introducaometodos02.test;

import br.com.maratonajava.java.core.introducaometodos02.classe.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.nome = "Thayna";
        prof.cpf = "111.876.987.09";
        prof.rg = "726252";
        prof.matricula = "716262k";

        Professor prof2 = new Professor();
        prof2.nome = "Maria";
        prof2.cpf = "111.987.726.08";
        prof2.rg = "1826363";
        prof2.matricula = "19273km";


        prof.imprime();
        prof2.imprime();




    }
}
