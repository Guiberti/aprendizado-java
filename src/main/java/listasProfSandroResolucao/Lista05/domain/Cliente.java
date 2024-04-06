package listasProfSandroResolucao.Lista05.domain;

public class Cliente extends Pessoa {
    public Cliente(String nomePessoa, String cidade, String bairro, String rua, Integer idade) {
        super(nomePessoa, cidade, bairro, rua, idade);
    }

    //Met add
    @Override
    public String apresentarse() {
        String resultado = ("Meu nome é: "
                .concat(nomePessoa)
                .concat(", minha idade é: ")
                .concat(idade + ".")
        );
        System.out.println(resultado);
        return resultado;
    }
}
