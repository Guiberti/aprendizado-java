package listasProfSandroResolucao.primeirob.Avaliacoes.Prova01.domain;

public class Aluno {
    private Integer id;
    private String nome;
    private Integer idade;
    private String curso;
    private Long ra;
    private String turma;

    public Aluno(Integer id, String nome, Integer idade, String curso, Long ra, String turma) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.ra = ra;
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

    public Long getRa() {
        return ra;
    }

    public void setRa(Long ra) {
        this.ra = ra;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
