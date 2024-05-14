package exemplosAulasSandro.codigos.exemplosProva.HotelProva.utils;

import exemplosAulasSandro.codigos.exemplosProva.HotelProva.domain.*;
import exemplosAulasSandro.codigos.exemplosProva.HotelProva.test.MenuPrincipalHotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MainFunctions {
    private static Hotel hotelGlobal = MenuPrincipalHotel.hotelGlobal.hotel;
    private static List<Cliente> clientesDoHotel = new ArrayList<>();
    private static List<Quarto> quartosDoHotel = new ArrayList<>();
    private static List<Reserva> reservasDoHotel = new ArrayList<>();
    private static long proximoIdReserva = 1;


    public static void cadastrarCliente() {
        System.out.println("Insira o nome: ");
        String nome = new Scanner(System.in).nextLine();

        System.out.println("Insira a idade: ");
        Integer idade = new Scanner(System.in).nextInt();

        System.out.println("Insira o estado em que reside: ");
        String estado = new Scanner(System.in).nextLine();

        System.out.println("Insira a cidade em que reside: ");
        String cidade = new Scanner(System.in).nextLine();

        System.out.println("Insira o bairro em que reside: ");
        String bairro = new Scanner(System.in).nextLine();

        System.out.println("Insira a rua em que reside: ");
        String rua = new Scanner(System.in).nextLine();

        System.out.println("Insira o numero em que reside: ");
        Integer numero = new Scanner(System.in).nextInt();

        System.out.println("Insira um complemento: ");
        String complemento = new Scanner(System.in).nextLine();

        Cliente cliente = Cliente.ClienteBuilder.builder()
                .nomePessoa(nome)
                .idadePessoa(idade)
                .endereco(Endereco.EnderecoBuilder.builder()
                        .estado(estado)
                        .cidade(cidade)
                        .bairro(bairro)
                        .rua(rua)
                        .numero(numero)
                        .complemento(complemento)
                        .build())
                .build();
        clientesDoHotel.add(cliente);
        System.out.println("Cliente cadastrado com sucesso...");
    }

    public static void cadastrarNovoQuarto() {
        System.out.println("Insira o número do quarto: ");
        Long numeroQuarto = new Scanner(System.in).nextLong();

        Quarto quarto = Quarto.QuartoBuilder.builder()
                .numeroQuarto(numeroQuarto)
                .hotel(hotelGlobal)
                .build();

        quartosDoHotel.add(quarto);
        System.out.println("Quarto cadastrado com sucesso...");
    }

    public static void listarClientes() {
        System.out.println("Lista de Clientes do hotel:" + hotelGlobal.getNomeFantasia());
        System.out.println("------------");

        if (clientesDoHotel.isEmpty()) {
            System.out.println("Não há clientes cadastrados no hotel.");
        } else {
            for (Cliente cliente : clientesDoHotel) {
                System.out.println(cliente.apresentarCliente());
            }
        }
        System.out.println("\nTotal de Clientes:" + clientesDoHotel.size());
    }

    public static void listarQuartos() {
        System.out.println("\n\nLista de Quartos do hotel:" + hotelGlobal.getNomeFantasia());
        System.out.println("------------");

        if (clientesDoHotel.isEmpty()) {
            System.out.println("Não há quartos cadastrados no hotel.");
        } else {
            for (Quarto quarto : quartosDoHotel) {
                System.out.println(quarto.apresentarQuarto());
            }
        }
        System.out.println("\nTotal de Quartos:" + quartosDoHotel.size());
    }

    public static Cliente encontrarClientePorNome(String nomeCliente) {
        for (Cliente cliente : clientesDoHotel) {
            if (cliente.getNomePessoa().equalsIgnoreCase(nomeCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public static Quarto encontrarQuartoPorNumero(long numeroQuarto) {
        for (Quarto quarto : quartosDoHotel) {
            if (quarto.getNumeroQuarto() == numeroQuarto) {
                return quarto;
            }
        }
        return null;
    }

    public static Reserva encontrarReservaPorId(Long id) {
        for (Reserva reserva : reservasDoHotel) {
            if (Objects.equals(reserva.getId(), id)) {
                return reserva;
            }
        }
        return null;
    }

    public static void reservarQuarto() {
        listarClientes();
        listarQuartos();

        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = new Scanner(System.in).nextLine();
        Cliente cliente = encontrarClientePorNome(nomeCliente);
        if (cliente == null) {
            System.out.println("Cliente não encontrado. Pedido não pode ser criado.");
            return;
        }

        System.out.println("Insira o número do quarto: ");
        long numeroQuarto = new Scanner(System.in).nextLong();
        Quarto quartoEncontrado = encontrarQuartoPorNumero(numeroQuarto);
        if (quartoEncontrado != null) {
            System.out.println("Quarto adicionado a reserva com sucesso!");
        } else {
            System.out.println("Quarto não encontrado no hotel. Tente novamente.");
            return;
        }

        System.out.println("Quantos dias gostaria de reservar o quarto? (Insira somente o número) ");
        Integer diasReserva = new Scanner(System.in).nextInt();

        Reserva reserva = Reserva.ReservaBuilder.builder()
                .id(proximoIdReserva++)
                .cliente(cliente)
                .quarto(quartoEncontrado)
                .dataCriacao(LocalDate.now())
                .hotel(hotelGlobal)
                .diasReserva(diasReserva)
                .build();

        reservasDoHotel.add(reserva);
        quartosDoHotel.remove(quartoEncontrado);
        System.out.println("Reserva criada com sucesso!");
    }

    public static void listarReservas() {
        System.out.println("\nLista de Reservas geradas no Hotel:" + hotelGlobal.getNomeFantasia());
        System.out.println("----------------------------------");

        if (reservasDoHotel.isEmpty()) {
            System.out.println("Ainda não há reservas geradas no hotel.");
        } else {
            for (Reserva reserva : reservasDoHotel) {
                System.out.println(reserva.descricaoReserva());
            }
        }

        System.out.println("\nTotal de Reservas: " + reservasDoHotel.size());
    }

    public static void realizarCheckIn() {
        listarReservas();

        System.out.println("Insira qual o ID da sua reserva: ");
        Long idReserva = new Scanner(System.in).nextLong();
        Reserva reservaEncontrada = encontrarReservaPorId(idReserva);
        if (reservaEncontrada != null) {
            System.out.println("Reserva encontrada!");
        } else {
            System.out.println("Reserva não encontrada no hotel. Tente novamente.");
            return;
        }

        System.out.println("Insira a data de realização do ChekIn");
        System.out.println("Dia: ");
        int dia = new Scanner(System.in).nextInt();
        System.out.println("Mês: ");
        int mes = new Scanner(System.in).nextInt();
        System.out.println("Ano: ");
        int ano = new Scanner(System.in).nextInt();

        CheckIn checkIn = CheckIn.CheckInBuilder.builder()
                .idReserva(idReserva)
                .dataCheckIn(LocalDate.of(ano, mes, dia))
                .dataCheckOut(LocalDate.of(ano, mes, dia).plusDays(reservaEncontrada.getDiasReserva()))
                .build();

        System.out.println(checkIn.gerarCheckIn());
    }

}
