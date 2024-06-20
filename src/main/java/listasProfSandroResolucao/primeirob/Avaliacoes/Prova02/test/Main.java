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
                case 1 -> cadastrarCliente();
                case 2 -> cadastrarEvento();
                case 3 -> listarEventos();
                case 4 -> comprarIngresso();
                case 5 -> utilizarIngresso();
                case 6 -> calcularValorIngresso();
                case 7 -> verificarDisponibilidadeEvento();
                default -> {
                    System.out.println();
                }
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

    private static void cadastrarCliente() {

    }

    private static void cadastrarEvento() {

    }

    private static void listarEventos() {

    }

    private static void comprarIngresso() {

    }

    private static void utilizarIngresso() {

    }

    private static void calcularValorIngresso() {

    }

    private static void verificarDisponibilidadeEvento() {

    }
}
