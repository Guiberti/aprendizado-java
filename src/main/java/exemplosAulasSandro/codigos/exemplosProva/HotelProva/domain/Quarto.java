package exemplosAulasSandro.codigos.exemplosProva.HotelProva.domain;

public class Quarto {

    private Long numeroQuarto;
    private Hotel hotel;

    private Quarto(Long numeroQuarto, Hotel hotel) {
        this.numeroQuarto = numeroQuarto;
        this.hotel = hotel;
    }

    public Long getNumeroQuarto() {
        return numeroQuarto;
    }

    public String apresentarQuarto() {
        return ("Quarto: " + numeroQuarto + ", hotel: " + hotel.getNomeFantasia() + ".");
    }


    public static final class QuartoBuilder {
        private Long numeroQuarto;
        private Hotel hotel;

        private QuartoBuilder() {
        }

        public static QuartoBuilder builder() {
            return new QuartoBuilder();
        }

        public QuartoBuilder numeroQuarto(Long numeroQuarto) {
            this.numeroQuarto = numeroQuarto;
            return this;
        }

        public QuartoBuilder hotel(Hotel hotel) {
            this.hotel = hotel;
            return this;
        }

        public Quarto build() {
            return new Quarto(numeroQuarto, hotel);
        }
    }
}
