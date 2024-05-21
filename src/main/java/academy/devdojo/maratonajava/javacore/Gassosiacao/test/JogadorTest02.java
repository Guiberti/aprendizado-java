package academy.devdojo.maratonajava.javacore.Gassosiacao.test;

import academy.devdojo.maratonajava.javacore.Gassosiacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassosiacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        System.out.println("Antes de setar o time");

        Jogador jogador1 = new Jogador("Sócrates");
        jogador1.imprime();
        Time time = new Time("Corinthians");

        System.out.println("\nDepois de setar o time");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
