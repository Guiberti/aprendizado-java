package listasProfSandroResolucao.primeirob.Avaliacoes.Prova01.domain;

import java.util.Date;

public class Livro {

    private Integer id;
    private String titulo;
    private Date dataLan;
    private String autor;
    private String editora;

    public Livro(Integer id, String titulo, Date dataLan, String autor, String editora) {
        this.id = id;
        this.titulo = titulo;
        this.dataLan = dataLan;
        this.autor = autor;
        this.editora = editora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataLan() {
        return dataLan;
    }

    public void setDataLan(Date dataLan) {
        this.dataLan = dataLan;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

}
