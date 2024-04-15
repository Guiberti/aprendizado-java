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

    private Loja(String cidade, String bairro, String rua, String nomeFantasia, String razaoSocial, String cnpj,
                 Vendedor[] vendedores, Cliente[] clientes) {
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

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
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
                .concat(" CNPJ: ")
                .concat(cnpj)
                .concat(" Endereço: ")
                .concat(" Cidade: ")
                .concat(cidade)
                .concat(" Bairro: ")
                .concat(bairro)
                .concat(" Rua")
                .concat(rua));
    }

}
