package academy.devdojo.maratonajava.javacore.Heranca.test;

import academy.devdojo.maratonajava.javacore.Heranca.domain.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da super classe é executado quando o JVm carregar a classe filha
    // 1 - Bloco de inicialização estático da sub classe é executado quando o JVm carregar a classe filha
    // 2 - Alocado espaço em memória pro objeto da superclasse
    // 3 - Cada atributo de classe é criado e inicializado com valoes default ou o que for passado da classe pai
    // 4 - Bloco de inicializacao da super classe é executado na ordem que aparece
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaço em memória pro objeto da sub classe
    // 7 - Cada atributo de sub classe é criado e inicializado com valoes default ou o que for passado
    // 8 - Bloco de inicializacao da sub classe é executado na ordem que aparece
    // 9 - Construtor da subclasse é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("jiraya");
    }

}
