package exemplosAulasSandro.codigos.exemplosProva.HotelProva.domain;

import java.time.LocalDate;

public class Reserva {
    private Long id;
    private LocalDate dataCriacao;
    private Cliente cliente;
    private Hotel hotel;
    private Quarto quarto;
    private Integer diasReserva;


    private Reserva(Long id, LocalDate dataCriacao, Cliente cliente, Hotel hotel, Quarto quarto, Integer diasReserva) {
        this.id = id;
        this.dataCriacao = LocalDate.now();
        this.cliente = cliente;
        this.hotel = hotel;
        this.quarto = quarto;
        this.diasReserva = diasReserva;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Integer getDiasReserva() {
        return diasReserva;
    }

    public String descricaoReserva() {

        String descricao = "================== Reserva ======================\n";
        descricao += "ID Reserva: " + id + "\n";
        descricao += "Data de Criação: " + dataCriacao + "\n";
        descricao += "Cliente: " + cliente.getNomePessoa() + "\n";
        descricao += "Quarto: " + quarto.getNumeroQuarto() + "\n";
        descricao += "Dias de Reserva: " + getDiasReserva() + "\n";
        descricao += "Hotel: " + hotel.getNomeFantasia() + "\n";
        descricao += "\n";
        descricao += "\n=============================================\n";
        return descricao;
    }


    public static final class ReservaBuilder {
        private Long id;
        private LocalDate dataCriacao;
        private Cliente cliente;
        private Hotel hotel;
        private Quarto quarto;
        private Integer diasReserva;

        private ReservaBuilder() {
        }

        public static ReservaBuilder builder() {
            return new ReservaBuilder();
        }

        public ReservaBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ReservaBuilder dataCriacao(LocalDate dataCriacao) {
            this.dataCriacao = dataCriacao;
            return this;
        }

        public ReservaBuilder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public ReservaBuilder hotel(Hotel hotel) {
            this.hotel = hotel;
            return this;
        }

        public ReservaBuilder quarto(Quarto quarto) {
            this.quarto = quarto;
            return this;
        }

        public ReservaBuilder diasReserva(Integer diasReserva) {
            this.diasReserva = diasReserva;
            return this;
        }

        public Reserva build() {
            return new Reserva(id, dataCriacao, cliente, hotel, quarto, diasReserva);
        }
    }
}
