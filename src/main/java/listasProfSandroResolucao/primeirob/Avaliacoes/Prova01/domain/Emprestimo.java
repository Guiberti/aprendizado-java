package listasProfSandroResolucao.primeirob.Avaliacoes.Prova01.domain;

import java.time.LocalDate;

public class Emprestimo {
    private Integer id;
    private Aluno aluno;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Integer id, Aluno aluno, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.id = id;
        this.aluno = aluno;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void imprime() {
        System.out.println("-------EMPRÉSTIMO--------");
        System.out.println("Aluno: " + aluno.getNome());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
