package cod.limpo.apostila.djava.HotelProva.test;

import cod.limpo.apostila.djava.HotelProva.domain.Cliente;
import cod.limpo.apostila.djava.HotelProva.domain.Endereco;
import cod.limpo.apostila.djava.HotelProva.domain.Hotel;
import cod.limpo.apostila.djava.HotelProva.domain.Quarto;

import java.util.List;

public class TestHotel {
    public static void main(String[] args) {

        Endereco enderecoTest = Endereco.EnderecoBuilder.builder()
                .estado("Paraná")
                .cidade("Cascavel")
                .bairro("Santa Cruz")
                .rua("Av Brasil")
                .numero(3456)
                .complemento("Hotel de Esquina")
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
                .nomeQuarto(1L)
                .hotel(hotel)
                .build();

        Quarto quarto2 = Quarto.QuartoBuilder.builder()
                .nomeQuarto(1L)
                .hotel(hotel)
                .build();

        hotel.setQuartos(List.of(quarto1, quarto2));

        System.out.println("============== HOTEL ============");
        hotel.apresentarHotel();

        System.out.println("============== CLIENTES ============");
        cliente1.apresentarCliente();
        cliente2.apresentarCliente();
        System.out.println("Total de CLientes: " + hotel.getClientes().size());


    }
}
