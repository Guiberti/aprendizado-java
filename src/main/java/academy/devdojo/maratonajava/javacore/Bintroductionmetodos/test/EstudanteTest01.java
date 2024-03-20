package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain.Estudantes;
import academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain.ImpressoraEstudantes;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudantes estudante01 = new Estudantes();
        Estudantes estudante02 = new Estudantes();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();

        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
//Prox Aula playlisst 51 - aula 50