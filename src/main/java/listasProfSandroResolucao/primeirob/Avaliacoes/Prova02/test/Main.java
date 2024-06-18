package listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.test;

import listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain.EventoRepository;
import listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain.IngressoRepository;

public class Main {
    public static void main(String[] args) {
        IngressoRepository ingressoRepository = new IngressoRepository();
        EventoRepository eventoRepository = new EventoRepository();


        while (true) {
            impressaoConsole();
        }

    }

    private static void impressaoConsole() {
        System.out.println("Insira uma das opções abaixo: ");
    }
}
