package listasProfSandroResolucao.Lista06.domain;

public class Vendedor extends Pessoa {
    Loja loja;
    double salarioBase;
    double[] salarioRecebido = new double[3];

    private Vendedor(String nomePessoa, Integer idade, String estado, String cidade, String bairro, String rua,
                     Integer numero, String complemento, Loja loja, double salarioBase, double[] salarioRecebido) {
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

}