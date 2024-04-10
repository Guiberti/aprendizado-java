package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jyraia");
        pessoa.setIdade(12);

        pessoa.imprime();
        //Para garantir um bom acomplamente, podemos mudar os modificadores de acesso.

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
