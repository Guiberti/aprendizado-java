package listasProfSandroResolucao.Lista06.domain;

public class Cliente extends Pessoa {

    private Cliente(String nomePessoa, Integer idade, Endereco endereco) {
        super(nomePessoa, idade, endereco);
    }

    // Met add
    @Override
    public String apresentarse() {
        return ("Nome: "
                .concat(nomePessoa + ", ")
                .concat("idade: ")
                .concat(idade + ", ")
                .concat("endereço: ")
                .concat(endereco.cidade + ", ")
                .concat(endereco.bairro + ", ")
                .concat(endereco.rua + ", ")
                .concat(endereco.numero + ", ")
                .concat(endereco.complemento + ", ")
                .concat(endereco.estado + ".\n")
        );
    }

    public static final class ClienteBuilder {
        private String nomePessoa;
        private Integer idade;
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

        public ClienteBuilder idade(Integer idade) {
            this.idade = idade;
            return this;
        }

        public ClienteBuilder endereco(Endereco endereco) {
            this.endereco = endereco;
            return this;
        }

        public Cliente build() {
            return new Cliente(nomePessoa, idade, endereco);
        }
    }

}
