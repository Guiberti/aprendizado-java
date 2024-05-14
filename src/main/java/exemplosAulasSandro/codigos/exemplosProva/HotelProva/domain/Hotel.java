package exemplosAulasSandro.codigos.exemplosProva.HotelProva.domain;

import java.util.List;

public class Hotel {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private Endereco endereco;
    private List<Cliente> clientes;
    private List<Quarto> quartos;

    private Hotel(String nomeFantasia, String razaoSocial, String cnpj, Endereco endereco, List<Cliente> clientes, List<Quarto> quartos) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.clientes = clientes;
        this.quartos = quartos;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public String apresentarHotel() {
        return ("Nome Fantasia: " + nomeFantasia + ", CNPJ: " + cnpj + ", Endereço: " +
                "Cidade: " + endereco.getCidade() +
                ", Bairro: " + endereco.getBairro() +
                ", Rua: " + endereco.getRua() + ".");
    }

    public static final class HotelBuilder {
        private String nomeFantasia;
        private String razaoSocial;
        private String cnpj;
        private Endereco endereco;
        private List<Cliente> clientes;
        private List<Quarto> quartos;

        private HotelBuilder() {
        }

        public static HotelBuilder builder() {
            return new HotelBuilder();
        }

        public HotelBuilder nomeFantasia(String nomeFantasia) {
            this.nomeFantasia = nomeFantasia;
            return this;
        }

        public HotelBuilder razaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
            return this;
        }

        public HotelBuilder cnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public HotelBuilder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public HotelBuilder clientes(List<Cliente> clientes) {
            this.clientes = clientes;
            return this;
        }

        public HotelBuilder quartos(List<Quarto> quartos) {
            this.quartos = quartos;
            return this;
        }

        public Hotel build() {
            return new Hotel(nomeFantasia, razaoSocial, cnpj, endereco, clientes, quartos);
        }
    }
}
