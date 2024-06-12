package academy.devdojo.maratonajava.javacore.Heranca.test;

import academy.devdojo.maratonajava.javacore.Heranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Heranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Heranca.domain.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("AVOLZ");
        endereco.setCep("85795000");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Gui");
        pessoa.setCpf("1316851");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("-------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Nagato");
        funcionario.setCpf("2222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();
        funcionario.relatorioPagamento();


    }

}

//74 - Orientação Objetos - Herança pt 04 - Construtores
