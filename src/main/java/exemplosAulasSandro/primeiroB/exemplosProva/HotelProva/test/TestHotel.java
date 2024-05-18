package exemplosAulasSandro.primeiroB.exemplosProva.HotelProva.test;

import exemplosAulasSandro.primeiroB.exemplosProva.HotelProva.domain.Cliente;
import exemplosAulasSandro.primeiroB.exemplosProva.HotelProva.domain.Endereco;
import exemplosAulasSandro.primeiroB.exemplosProva.HotelProva.domain.Hotel;
import exemplosAulasSandro.primeiroB.exemplosProva.HotelProva.domain.Quarto;

import java.util.List;

public class TestHotel {
    public static void main(String[] args) {

        Endereco enderecoTest = Endereco.EnderecoBuilder.builder()
                .estado("Paraná")
                .cidade("Cascavel")
                .bairro("Santa Cruz")
                .rua("Av Brasil")
                .numero(3456)
                .complemento("Esquina")
                .build();

        Hotel hotel = Hotel.HotelBuilder.builder()
                .nomeFantasia("Hotel Halley")
                .razaoSocial("valleyhoteis")
                .cnpj("17232607000510")
                .endereco(enderecoTest)
                .clientes(null)
                .quartos(null)
                .build();

        Cliente cliente1 = Cliente.ClienteBuilder.builder()
                .nomePessoa("Guilherme")
                .idadePessoa(18)
                .endereco(enderecoTest)
                .build();

        Cliente cliente2 = Cliente.ClienteBuilder.builder()
                .nomePessoa("Bernardo")
                .idadePessoa(18)
                .endereco(enderecoTest)
                .build();

        hotel.setClientes(List.of(cliente1, cliente2));

        Quarto quarto1 = Quarto.QuartoBuilder.builder()
                .numeroQuarto(1L)
                .hotel(hotel)
                .build();

        Quarto quarto2 = Quarto.QuartoBuilder.builder()
                .numeroQuarto(2L)
                .hotel(hotel)
                .build();

        hotel.setQuartos(List.of(quarto1, quarto2));

        System.out.println("============== HOTEL ============");
        System.out.println(hotel.apresentarHotel());

        System.out.println("\n============== CLIENTES ============");
        System.out.println(cliente1.apresentarCliente());
        System.out.println(cliente2.apresentarCliente());
        System.out.println("Total de CLientes: " + hotel.getClientes().size());

        System.out.println("\n============== QUARTOS ============");
        System.out.println(quarto1.apresentarQuarto());
        System.out.println(quarto2.apresentarQuarto());
        System.out.println("Total de Quartos: " + hotel.getQuartos().size());


    }
}
