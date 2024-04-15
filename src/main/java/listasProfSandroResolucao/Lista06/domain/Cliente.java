package listasProfSandroResolucao.Lista06.domain;

public class Cliente extends Pessoa {
    private Cliente(String nomePessoa, Integer idade, String estado, String cidade, String bairro, String rua,
                    Integer numero, String complemento) {
        super(nomePessoa, idade, estado, cidade, bairro, rua, numero, complemento);
    }

    // Met add
    @Override
    public String apresentarse() {
        return ("Meu nome é: "
                .concat(nomePessoa)
                .concat(", minha idade é: ")
                .concat(idade + "."));
    }

    public static final class ClienteBuilder {
        private String nomePessoa;
        private Integer idade;
        private String estado;
        private String cidade;
        private String bairro;
        private String rua;
        private Integer numero;
        private String complemento;

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

        public ClienteBuilder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public ClienteBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public ClienteBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public ClienteBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public ClienteBuilder numero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public ClienteBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }


        public Cliente build() {
            return new Cliente(nomePessoa, idade, estado, cidade, bairro, rua, numero, complemento);
        }
    }

}
