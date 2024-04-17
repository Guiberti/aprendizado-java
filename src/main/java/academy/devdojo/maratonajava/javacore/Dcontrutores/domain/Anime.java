package academy.devdojo.maratonajava.javacore.Dcontrutores.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    //Vamos utilizar a sobrecarga de métodos agora:
    // public void init(String nome, String tipo, int episodios){
    //    this.nome = nome;
    //    this.tipo = tipo;
    //    this.episodios = episodios;
    //}
    //Como pode ver, temos dois métodos com o mesmo nome, mas com a quantidade de
    //parametros diferentes
    // public void init(String nome, String tipo, int episodios, String genero){
    // this.nome = nome;
    // this.tipo = tipo;
    //  this.episodios = episodios;
    //    this.genero = genero;
    //  }

    // public void init(String nome, String tipo, int episodios) {
    // this.nome = nome;
    //       this.tipo = tipo;
    //       this.episodios = episodios;
    //    }
    //Segunda opção de sobrecarga
    //   public void init(String nome, String tipo, int episodios, String genero) {
    //       this.init(nome, tipo, episodios);
    //       this.genero = genero;
    // }
    //Não podem ser iguais (ambiguidade), somente a sobrecarga de métodos

    public Anime(String nome, String tipo, int episodios, String genero) {
        this(); //para chamar outro construtor (sobrecarga de cosntrutor)
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

}
