package listasProfSandroResolucao.Lista06.domain;

public class Loja extends Endereco {
    private String nomeFantasia;
    private String razaoSocial;
    private Long cnpj;
    private Vendedor[] vendedores;
    private Cliente[] clientes;

    private Loja(String estado, String cidade, String bairro, String rua, Integer numero, String complemento,
                 String nomeFantasia, String razaoSocial, Long cnpj, Vendedor[] vendedores, Cliente[] clientes) {
        super(estado, cidade, bairro, rua, numero, complemento);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.vendedores = vendedores;
        this.clientes = clientes;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    // met add
    public int contarClientes() {
        return clientes.length;
    }

    public int contarVendedores() {
        return vendedores.length;
    }

    public String apresentarse() {
        return ("Nome Fantasia: "
                .concat(nomeFantasia)
                .concat(", CNPJ: ")
                .concat(String.valueOf(cnpj))
                .concat(", Endereço: ")
                .concat(" Cidade: ")
                .concat(cidade)
                .concat(", Bairro: ")
                .concat(bairro)
                .concat(", Rua: ")
                .concat(rua)
                .concat(".")
        );
    }


    public static final class LojaBuilder {
        private String estado;
        private String cidade;
        private String bairro;
        private String rua;
        private Integer numero;
        private String complemento;
        private String nomeFantasia;
        private String razaoSocial;
        private Long cnpj;
        private Vendedor[] vendedores;
        private Cliente[] clientes;

        private LojaBuilder() {
        }

        public static LojaBuilder builder() {
            return new LojaBuilder();
        }

        public LojaBuilder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public LojaBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public LojaBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public LojaBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public LojaBuilder numero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public LojaBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public LojaBuilder nomeFantasia(String nomeFantasia) {
            this.nomeFantasia = nomeFantasia;
            return this;
        }

        public LojaBuilder razaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
            return this;
        }

        public LojaBuilder cnpj(Long cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public LojaBuilder vendedores(Vendedor[] vendedores) {
            this.vendedores = vendedores;
            return this;
        }

        public LojaBuilder clientes(Cliente[] clientes) {
            this.clientes = clientes;
            return this;
        }

        public Loja build() {
            return new Loja(estado, cidade, bairro, rua, numero, complemento, nomeFantasia, razaoSocial, cnpj, vendedores, clientes);
        }
    }
}
