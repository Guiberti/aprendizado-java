package listasProfSandroResolucao.Lista06.domain;

public abstract class Pessoa extends Endereco {
    protected String nomePessoa;
    protected Integer idade;

    protected Pessoa(String nomePessoa, Integer idade, String estado, String cidade, String bairro, String rua,
                     Integer numero, String complemento) {
        super(estado, cidade, bairro, rua, numero, complemento);
        this.nomePessoa = nomePessoa;
        this.idade = idade;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public Integer getIdade() {
        return idade;
    }

    // met add
    public abstract String apresentarse();
}
