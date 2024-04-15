package listasProfSandroResolucao.Lista06.domain;

public class Gerente extends Pessoa {
    Loja loja;
    double salarioBase;
    double[] salarioRecebido = new double[3];

    private Gerente(String nomePessoa, String cidade, String bairro, String rua, Integer idade,
                    Loja loja, double salarioBase, double[] salarioRecebido) {
        super(nomePessoa, cidade, bairro, rua, idade);
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
        double soma = 0;
        for (double salario : salarioRecebido) {
            soma += salario;
        }
        return soma / salarioRecebido.length;
    }

    public double calcularBonus() {
        return salarioBase * 0.35;
    }


    public static final class GerenteBuilder {
        private Loja loja;
        private double salarioBase;
        private double[] salarioRecebido;
        private String nomePessoa;
        private Integer idade;
        private String cidade;
        private String bairro;
        private String rua;

        private GerenteBuilder() {
        }

        public static GerenteBuilder builder() {
            return new GerenteBuilder();
        }

        public GerenteBuilder loja(Loja loja) {
            this.loja = loja;
            return this;
        }

        public GerenteBuilder salarioBase(double salarioBase) {
            this.salarioBase = salarioBase;
            return this;
        }

        public GerenteBuilder salarioRecebido(double[] salarioRecebido) {
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

        public Gerente build() {
            return new Gerente(nomePessoa, cidade, bairro, rua, idade, loja, salarioBase, salarioRecebido);
        }
    }

}
