package listasProfSandroResolucao.primeirob.Lista06.domain;

public abstract class Pessoa {
    protected String nomePessoa;
    protected Integer idade;
    protected Endereco endereco;

    protected Pessoa(String nomePessoa, Integer idade, Endereco endereco) {
        this.nomePessoa = nomePessoa;
        this.idade = idade;
        this.endereco = endereco;
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