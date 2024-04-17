package listasProfSandroResolucao.Lista06.domain;

import java.util.List;

public class Vendedor extends Pessoa {
    private Loja loja;
    private double salarioBase;
    private List<Double> salarioRecebido;

    private Vendedor(String nomePessoa, Integer idade, String estado, String cidade, String bairro, String rua,
                     Integer numero, String complemento, Loja loja, double salarioBase, List<Double> salarioRecebido) {
        super(nomePessoa, idade, estado, cidade, bairro, rua, numero, complemento);
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    // Met add
    @Override
    public String apresentarse() {
        return ("Meu nome é: "
                .concat(nomePessoa)
                .concat(", minha idade é: ")
                .concat(String.valueOf(idade))
                .concat(", sou vendedor(a) da loja: ")
                .concat((loja == null) ? "null" : loja.getNomeFantasia())
                .concat("."));
    }

    public double calcularMedia() {
        double soma = salarioRecebido.stream().mapToDouble(Double::doubleValue).sum();
        return soma / salarioRecebido.size();
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }


    public static final class VendedorBuilder {
        private String estado;
        private String cidade;
        private String bairro;
        private String rua;
        private Integer numero;
        private String complemento;
        private String nomePessoa;
        private Integer idade;
        private Loja loja;
        private double salarioBase;
        private List<Double> salarioRecebido;

        private VendedorBuilder() {
        }

        public static VendedorBuilder builder() {
            return new VendedorBuilder();
        }

        public VendedorBuilder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public VendedorBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public VendedorBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public VendedorBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public VendedorBuilder numero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public VendedorBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public VendedorBuilder nomePessoa(String nomePessoa) {
            this.nomePessoa = nomePessoa;
            return this;
        }

        public VendedorBuilder idade(Integer idade) {
            this.idade = idade;
            return this;
        }

        public VendedorBuilder loja(Loja loja) {
            this.loja = loja;
            return this;
        }

        public VendedorBuilder salarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
            return this;
        }

        public VendedorBuilder salarioRecebido(List<Double> salarioRecebido) {
            this.salarioRecebido = salarioRecebido;
            return this;
        }

        public Vendedor build() {
            return new Vendedor(nomePessoa, idade, estado, cidade, bairro, rua, numero, complemento, loja, salarioBase, salarioRecebido);
        }
    }


}
