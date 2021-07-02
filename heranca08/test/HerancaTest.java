package br.com.maratonajava.java.core.heranca08.test;

import br.com.maratonajava.java.core.heranca08.classes.Endereco;
import br.com.maratonajava.java.core.heranca08.classes.Funcionario;
import br.com.maratonajava.java.core.heranca08.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setNome("Aplollo");
        p.setCpf("12345678911");

        Endereco end = new Endereco();
        end.setBairro("mata");
        end.setRua("rua 709");
        p.setEndereco(end);
        p.imprime();

        System.out.println("---------------------------------------");

        Funcionario f = new Funcionario ();
        f.setNome("Mel");
        f.setCpf("09876577667");
        f.setSalario(15000);
        f.setEndereco(end);
        f.imprime();

    }
}

// ****************** ordem de inicializacao ***********
// 1 espaco em memoria e alocado para o objeto sendo construido
// 2 cada um dos atributros do objeto e criado e inicializado com os valores default
// 3 o construtor da superclasse e chamado
// 4 a inicializacao dos atributos via declaracao e codigo do bloco de inicializacao da superclasse sao execultados
//   na ordem que aparecem
// 5 o codigo do contrutor da superclasse e chamado
// 6 passo 4 para a subclasse e execultado
// 7 o codigo do construtor da classe e excultado

