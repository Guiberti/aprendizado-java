package listasProfSandroResolucao.Lista06.domain;

public abstract class Pessoa {
    String nomePessoa;
    Integer idade;
    String cidade;
    String bairro;
    String rua;

    public Pessoa(String nomePessoa, String cidade, String bairro, String rua, Integer idade) {
        this.nomePessoa = nomePessoa;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.idade = idade;
    }

    // met add
    public abstract String apresentarse();
}
