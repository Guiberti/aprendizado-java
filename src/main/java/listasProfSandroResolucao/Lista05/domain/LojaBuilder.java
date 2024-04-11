package listasProfSandroResolucao.Lista05.domain;

public final class LojaBuilder {
    private String cidade;
    private String bairro;
    private String rua;
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private Vendedor[] vendedores;
    private Cliente[] clientes;

    private LojaBuilder() {
    }

    public static LojaBuilder aLoja() {
        return new LojaBuilder();
    }

    public LojaBuilder withCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public LojaBuilder withBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public LojaBuilder withRua(String rua) {
        this.rua = rua;
        return this;
    }

    public LojaBuilder withNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
        return this;
    }

    public LojaBuilder withRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public LojaBuilder withCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public LojaBuilder withVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
        return this;
    }

    public LojaBuilder withClientes(Cliente[] clientes) {
        this.clientes = clientes;
        return this;
    }

    public Loja build() {
        return new Loja(cidade, bairro, rua, nomeFantasia, razaoSocial, cnpj, vendedores, clientes);
    }
}
