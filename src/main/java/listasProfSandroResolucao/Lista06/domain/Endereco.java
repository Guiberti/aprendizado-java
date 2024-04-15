package listasProfSandroResolucao.Lista06.domain;

public abstract class Endereco {
    protected String estado;
    protected String cidade;
    protected String bairro;
    protected String rua;
    protected Integer numero;
    protected String complemento;

    protected Endereco(String estado, String cidade, String bairro, String rua, Integer numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    protected String apresentarLogradouro() {
        return ("Moro no estado de: " + estado + " ,na cidade de: " + cidade + ", no bairro: " + bairro
                + ", na rua: " + rua + ", complemento: " + complemento + ".");
    }
}
