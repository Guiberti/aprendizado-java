package listasProfSandroResolucao.Lista05.domain;

public class Cliente extends Pessoa {
    private Cliente(String nomePessoa, String cidade, String bairro, String rua, Integer idade) {
        super(nomePessoa, cidade, bairro, rua, idade);
    }

    //Met add
    @Override
    public String apresentarse() {
        System.out.println("Meu nome é: "
                .concat(nomePessoa)
                .concat(", minha idade é: ")
                .concat(idade + ".")
        );
        return null;
    }
}
