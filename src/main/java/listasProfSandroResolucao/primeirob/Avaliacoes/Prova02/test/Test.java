package listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.test;

import listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain.*;

import java.time.LocalDate;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        IngressoRepository ingressoRepository = new IngressoRepository();

        Ingresso ingressoTest = new Ingresso(1, null, null, "ingresso dia 1", 2
                , LocalDate.of(2024, 06, 21), 75d);
        ingressoRepository.save(ingressoTest);

        Evento eventoTest = new Evento(1, "Buteco do Embaixador", 1500, 150d,
                LocalDate.of(2024, 06, 20), LocalDate.of(2024, 06, 23));

        Cliente clienteTest = new Cliente(1, "Gui", 18, null, "Masc");

        Endereco enderecoTest = new Endereco("Santa Lúcia", "Centro", "Avenida Orlando Luiz Zamprônio",
                325);


        clienteTest.setEndereco(enderecoTest);
        ingressoTest.setEvento(eventoTest);
        ingressoTest.setCliente(clienteTest);

        System.out.println(eventoTest.toString());
        System.out.println("------");
        System.out.println(ingressoTest.toString());
        System.out.println("------");
        System.out.println(clienteTest.toString());
        System.out.println("------");
        System.out.println(enderecoTest.toString());
        System.out.println("------");

        Optional<Ingresso> foundIngresso = ingressoRepository.findById(1);
        if (foundIngresso.isPresent()) {
            System.out.println("Ingresso encontrado: " + foundIngresso.get());
        } else {
            System.out.println("Ingresso com ID " + 1 + " não encontrado.");
        }


    }
}
