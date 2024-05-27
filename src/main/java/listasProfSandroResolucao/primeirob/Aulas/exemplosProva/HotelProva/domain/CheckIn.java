package listasProfSandroResolucao.primeirob.Aulas.exemplosProva.HotelProva.domain;

import java.time.LocalDate;

public class CheckIn {
    private Long idReserva;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;

    private CheckIn(Long idReserva, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.idReserva = idReserva;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public Long getIdReserva() {
        return idReserva;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public String gerarCheckIn() {
        return ("ID da reserva: " + getIdReserva() + ".\n" + "Data de CheckIn: " + getDataCheckIn() + ".\n" +
                "Data de CheckOut: " + getDataCheckOut() + ".");
    }

    public static final class CheckInBuilder {
        private Long idReserva;
        private LocalDate dataCheckIn;
        private LocalDate dataCheckOut;

        private CheckInBuilder() {
        }

        public static CheckInBuilder builder() {
            return new CheckInBuilder();
        }

        public CheckInBuilder idReserva(Long idReserva) {
            this.idReserva = idReserva;
            return this;
        }

        public CheckInBuilder dataCheckIn(LocalDate dataCheckIn) {
            this.dataCheckIn = dataCheckIn;
            return this;
        }

        public CheckInBuilder dataCheckOut(LocalDate dataCheckOut) {
            this.dataCheckOut = dataCheckOut;
            return this;
        }

        public CheckIn build() {
            return new CheckIn(idReserva, dataCheckIn, dataCheckOut);
        }
    }
}
