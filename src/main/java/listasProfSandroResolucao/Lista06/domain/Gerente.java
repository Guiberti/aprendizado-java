package listasProfSandroResolucao.Lista06.domain;

import java.util.List;

public class Gerente extends Pessoa {
    private Loja loja;
    private double salarioBase;
    private List<Double> salarioRecebido;

    private Gerente(String nomePessoa, Integer idade, String estado, String cidade, String bairro, String rua,
                    Integer numero, String complemento, Loja loja, double salarioBase, List<Double> salarioRecebido) {
        super(nomePessoa, idade, estado, cidade, bairro, rua, numero, complemento);
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    @Override
    public String apresentarse() {
        return ("Meu nome é: "
                .concat(nomePessoa)
                .concat(", tenho idade é: ")
                .concat(String.valueOf(idade))
                .concat(", sou gerente da loja: ")
                .concat((loja == null) ? "null" : loja.getNomeFantasia())
                .concat("."));
    }

    public double calcularMedia() {
        double soma = salarioRecebido.stream().mapToDouble(Double::doubleValue).sum();
        return soma / salarioRecebido.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }

    public static final class GerenteBuilder {
        private String estado;
        private String cidade;
        private String bairro;
        private String rua;
        private Integer numero;
        private String complemento;
        private Loja loja;
        private double salarioBase;
        private List<Double> salarioRecebido;
        private String nomePessoa;
        private Integer idade;

        private GerenteBuilder() {
        }

        public static GerenteBuilder builder() {
            return new GerenteBuilder();
        }

        public GerenteBuilder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public GerenteBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public GerenteBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public GerenteBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public GerenteBuilder numero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public GerenteBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public GerenteBuilder loja(Loja loja) {
            this.loja = loja;
            return this;
        }

        public GerenteBuilder salarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
            return this;
        }

        public GerenteBuilder salarioRecebido(List<Double> salarioRecebido) {
            this.salarioRecebido = salarioRecebido;
            return this;
        }

        public GerenteBuilder nomePessoa(String nomePessoa) {
            this.nomePessoa = nomePessoa;
            return this;
        }

        public GerenteBuilder idade(Integer idade) {
            this.idade = idade;
            return this;
        }

        public Gerente build() {
            return new Gerente(nomePessoa, idade, estado, cidade, bairro, rua, numero, complemento,
                    loja, salarioBase, salarioRecebido);
        }
    }
}
