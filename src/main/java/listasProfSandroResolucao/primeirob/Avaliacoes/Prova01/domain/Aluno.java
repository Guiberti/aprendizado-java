package listasProfSandroResolucao.primeirob.Avaliacoes.Prova01.domain;

public class Aluno {
    private Integer id;
    private String nome;
    private Integer idade;
    private String curso;
    private Long registroAluno;
    private String turma;

    public Aluno(Integer id, String nome, Integer idade, String curso, Long registroAluno, String turma) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.registroAluno = registroAluno;
        this.turma = turma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Long getregistroAluno() {
        return registroAluno;
    }

    public void setregistroAluno(Long registroAluno) {
        this.registroAluno = registroAluno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
