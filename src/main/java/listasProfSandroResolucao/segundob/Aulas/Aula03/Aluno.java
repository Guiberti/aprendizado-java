package listasProfSandroResolucao.segundob.Aulas.Aula03;

public class Aluno {

    public Aluno(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private String nome;

    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

}
