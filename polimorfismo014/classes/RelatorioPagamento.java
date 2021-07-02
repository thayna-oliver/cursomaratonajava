package br.com.maratonajava.java.core.polimorfismo014.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente (Gerente gerente){
//        System.out.println("Gerendo relatorio de pagamento para a gerencia");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " +gerente.getNome());
//        System.out.println("salario: " +gerente.getSalario());
//    }
//    public void relatorioPagamentoVendedor (Vendedor vendedor){
//        System.out.println("Gerendo relatorio de pagamento para os vendendores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: " +vendedor.getNome());
//        System.out.println("salario: " +vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerendo relatorio de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " +funcionario.getNome());
        System.out.println("salario: " +funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("Participacao nos Lucros" + g.getPnl());
        }
        if (funcionario instanceof  Vendedor){
            Vendedor v = (Vendedor)funcionario;
            System.out.println("Total Vendas: "+((Vendedor) funcionario).getTotalVendas());
        }

    }
}
