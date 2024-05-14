package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    //Bloco de inicialização de instancia
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valoes default ou o que for passado
    // 3 - Bloco de inicializacao é executado
    // 4 - Construtor é executado
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    //Prox aula 61 - Modificador Static (sequencia 62)
}
