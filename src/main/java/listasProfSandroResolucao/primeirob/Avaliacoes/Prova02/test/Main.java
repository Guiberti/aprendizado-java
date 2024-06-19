package listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.test;

import listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain.ClienteRepository;
import listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain.EventoRepository;
import listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain.IngressoRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IngressoRepository ingressoRepository = new IngressoRepository();
        EventoRepository eventoRepository = new EventoRepository();
        ClienteRepository clienteRepository = new ClienteRepository();
        Scanner input = new Scanner(System.in);


        while (true) {
            impressaoConsole();
            int opcao = input.nextInt();
            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1 -> clienteRepository.save();
                case 2 -> ;
                case 3 -> ;
                case 4 -> ;
                case 5 -> ;
                case 6 -> ;
                case 7 -> ;
                default -> ;
            }

        }

    }
    private static void impressaoConsole() {
        System.out.println("Insira uma das opções abaixo: ");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Cadastrar Evento");
        System.out.println("3 - Listar Eventos");
        System.out.println("4 - Comprar Ingresso do Evento");
        System.out.println("5 - Utilizar Ingresso do Evento");
        System.out.println("6 - Calcular Valor do Ingresso");
        System.out.println("7 - Verificar disponibilidade por evento");
        System.out.println("0 - Sair do sistema");
    }
}
