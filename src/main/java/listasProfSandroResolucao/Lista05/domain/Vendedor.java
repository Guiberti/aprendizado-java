package listasProfSandroResolucao.Lista05.domain;

public class Vendedor extends Pessoa {
    Loja loja;
    double salarioBase;
    double[] salarioRecebido = new double[3];

    public Vendedor(String nomePessoa, Integer idade, Loja loja, String cidade, String bairro, String rua, double salarioBase, double[]salarioRecebido) {
        super(nomePessoa, cidade, bairro, rua, idade);
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public Loja getLoja() {
        return loja;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double[] getSalarioRecebido() {
        return salarioRecebido;
    }

    //Met add
    @Override
    public String apresentarse() {
        String resultado = ("Meu nome é: "
                .concat(nomePessoa)
                .concat(", minha idade é: ")
                .concat(String.valueOf(idade))
                .concat(", minha loja é: ")
                .concat((loja == null) ? "null" : loja.getNomeFantasia())
                .concat(".")
        );
        System.out.println(resultado);
        return resultado;
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
