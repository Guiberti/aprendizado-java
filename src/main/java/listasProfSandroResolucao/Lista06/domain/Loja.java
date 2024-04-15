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

}
