package listasProfSandroResolucao.Lista06.domain;

public abstract class Pessoa extends Endereco {
    String nomePessoa;
    Integer idade;
    Endereco endereco;

    public Pessoa(String nomePessoa, Integer idade, Endereco endereco) {
        super(endereco.estado, endereco.cidade, endereco.bairro, endereco.rua, endereco.numero,
                endereco.complemento);
        this.nomePessoa = nomePessoa;
        this.idade = idade;
    }

    // met add
    public abstract String apresentarse();
}
