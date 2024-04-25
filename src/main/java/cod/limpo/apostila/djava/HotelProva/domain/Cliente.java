package cod.limpo.apostila.djava.HotelProva.domain;

public class Cliente {
    private String nomePessoa;
    private Integer idadePessoa;
    private Endereco endereco;

    private Cliente(String nomePessoa, Integer idadePessoa, Endereco endereco) {
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
        this.endereco = endereco;
    }

    public String apresentarCliente() {
        return ("Nome: " + nomePessoa + ", idade: " + idadePessoa + ", endereço: " +
                endereco.getCidade() + ", " + endereco.getBairro() + ", " +
                endereco.getRua() + ", " + endereco.getComplemento() + ", " + endereco.getEstado());
    }


    public static final class ClienteBuilder {
        private String nomePessoa;
        private Integer idadePessoa;
        private Endereco endereco;

        private ClienteBuilder() {
        }

        public static ClienteBuilder builder() {
            return new ClienteBuilder();
        }

        public ClienteBuilder nomePessoa(String nomePessoa) {
            this.nomePessoa = nomePessoa;
            return this;
        }

        public ClienteBuilder idadePessoa(Integer idadePessoa) {
            this.idadePessoa = idadePessoa;
            return this;
        }

        public ClienteBuilder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Cliente build() {
            return new Cliente(nomePessoa, idadePessoa, endereco);
        }
    }
}
