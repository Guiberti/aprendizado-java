package exemplosAulasSandro.primeiroB.exemplosProva.HotelProva.test;

import exemplosAulasSandro.primeiroB.exemplosProva.HotelProva.domain.Endereco;
import exemplosAulasSandro.primeiroB.exemplosProva.HotelProva.domain.Hotel;
import exemplosAulasSandro.primeiroB.exemplosProva.HotelProva.utils.MainFunctions;

import java.util.Scanner;

public class MenuPrincipalHotel {
    public static void main(String[] args) {

        Hotel hotel = Hotel.HotelBuilder.builder()
                .nomeFantasia("Hotel Halley")
                .razaoSocial("valleyhoteis")
                .cnpj("17232607000510")
                .endereco(Endereco.EnderecoBuilder.builder()
                        .estado("Paraná")
                        .cidade("Santa Lúcia")
                        .bairro("Centro")
                        .rua("Avenida OLZ")
                        .numero(345)
                        .complemento("Loja de Esquina")
                        .build())
                .clientes(null)
                .quartos(null)
                .build();

        hotelGlobal.hotel = hotel;
        int opcaoMenu;


        while (true) {
            System.out.println("\nMenu Hotel: " + hotel.getNomeFantasia());
            System.out.println("-----------------");

            System.out.println("1. Cadastrar Novo Cliente");
            System.out.println("2. Cadastrar Novo Quarto");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Listar Quartos");
            System.out.println("5. Reservar Quartos");
            System.out.println("6. Listar Reservas");
            System.out.println("7. Realizar Check-in");
            System.out.println("0. Sair do Sistema");

            System.out.print("Digite sua opção: ");
            opcaoMenu = new Scanner(System.in).nextInt();
            if (opcaoMenu == 0) {
                System.out.println("Saindo do sistema...");
                break;
            }
            switch (opcaoMenu) {
                case 1 -> MainFunctions.cadastrarCliente();
                case 2 -> MainFunctions.cadastrarNovoQuarto();
                case 3 -> MainFunctions.listarClientes();
                case 4 -> MainFunctions.listarQuartos();
                case 5 -> MainFunctions.reservarQuarto();
                case 6 -> MainFunctions.listarReservas();
                case 7 -> MainFunctions.realizarCheckIn();
                default -> System.out.println("Opcão Inválida...");
            }
        }
    }

    public static class hotelGlobal {
        public static Hotel hotel;
    }

}
