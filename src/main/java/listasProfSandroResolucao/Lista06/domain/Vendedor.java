package listasProfSandroResolucao.Lista06.domain;

public class Vendedor extends Pessoa {
    Loja loja;
    double salarioBase;
    double[] salarioRecebido = new double[3];

    private Vendedor(String nomePessoa, Integer idade, Endereco endereco,
                     Loja loja ,double salarioBase, double[] salarioRecebido) {
        super(nomePessoa, idade, endereco.estado, endereco.);
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
                .concat(", sou vendedor da loja: ")
                .concat((loja == null) ? "null" : loja.getNomeFantasia())
                .concat("."));
    }

    public double calcularMedia() {
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.2;
    }

    public static final class VendedorBuilder {
        private String nomePessoa;
        private String cidade;
        private String bairro;
        private String rua;
        private Integer idade;
        private Loja loja;
        private double salarioBase;
        private double[] salarioRecebido;

        private VendedorBuilder() {
        }

        public static VendedorBuilder builder() {
            return new VendedorBuilder();
        }

        public VendedorBuilder nomePessoa(String nomePessoa) {
            this.nomePessoa = nomePessoa;
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

        public VendedorBuilder salarioRecebido(double[] salarioRecebido) {
            this.salarioRecebido = salarioRecebido;
            return this;
        }

        public Vendedor build() {
            return new Vendedor(nomePessoa, idade, loja, cidade, bairro, rua, salarioBase, salarioRecebido);
        }
    }
}