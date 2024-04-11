package listasProfSandroResolucao.Lista05.domain;

public class Loja {
    String cidade;
    String bairro;
    String rua;
    String nomeFantasia;
    String razaoSocial;
    String cnpj;
    Vendedor[] vendedores;
    Cliente[] clientes;

    private Loja(String cidade, String bairro, String rua, String nomeFantasia, String razaoSocial, String cnpj, Vendedor[] vendedores, Cliente[] clientes) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.vendedores = vendedores;
        this.clientes = clientes;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    //met add
    public int contarClientes() {
        return clientes.length;
    }

    public int contarVendedores() {
        return vendedores.length;
    }
    public void apresentarse() {
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço:");
        System.out.println("  Cidade: " + cidade);
        System.out.println("  Bairro: " + bairro);
        System.out.println("  Rua: " + rua);
    }

    public static final class LojaBuilder {
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

        public static LojaBuilder builder() {
            return new LojaBuilder();
        }

        public LojaBuilder Cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public LojaBuilder Bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public LojaBuilder Rua(String rua) {
            this.rua = rua;
            return this;
        }

        public LojaBuilder NomeFantasia(String nomeFantasia) {
            this.nomeFantasia = nomeFantasia;
            return this;
        }

        public LojaBuilder RazaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
            return this;
        }

        public LojaBuilder Cnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public LojaBuilder Vendedores(Vendedor[] vendedores) {
            this.vendedores = vendedores;
            return this;
        }

        public LojaBuilder  Clientes(Cliente[] clientes) {
            this.clientes = clientes;
            return this;
        }

        public Loja build() {
            return new Loja(cidade, bairro, rua, nomeFantasia, razaoSocial, cnpj, vendedores, clientes);
        }
    }

}
