package listasProfSandroResolucao.Lista06.test;

import listasProfSandroResolucao.Lista06.domain.Endereco;
import listasProfSandroResolucao.Lista06.domain.Loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final List<Loja> lojas = new ArrayList<>();

    public static void main(String[] args) {

        lojas.add(Loja.LojaBuilder.builder()
                .nomeFantasia("Myy Plants")
                .razaoSocial("mypla")
                .cnpj("12345678912345")
                .endereco(new Endereco("Paraná", "Santa Lúcia", "Centro", "Avenida OLZ",
                        455, "Loja de Esquina"))
                .vendedores(null)
                .clientes(null)
                .build());
        lojas.add(Loja.LojaBuilder.builder()

                .nomeFantasia("Magazine Móveis")
                .razaoSocial("magalu")
                .cnpj("17235604000110")
                .endereco(new Endereco("Paraná", "Santa Lúcia", "Centro",
                        "Avenida Americo Mantovani", 45, "Loja de Esquina"))
                .vendedores(null)
                .clientes(null)
                .build());

        menuPrincipal(); // Chama o menu principal
    }

    private static void menuPrincipal() {
        int opcao;

        while (true) {

            System.out.println("\n\nMenu Principal");
            System.out.println("-----------------");

            for (int i = 0; i < lojas.size(); i++) {
                System.out.println((i + 1) + ". " + lojas.get(i).getNomeFantasia());
            }

            System.out.println((lojas.size() + 1) + ". Criar Nova Loja");

            System.out.print("Digite sua opção: ");
            opcao = new Scanner(System.in).nextInt();

            if (opcao == 0) {
                return;
            }
            if (opcao == lojas.size() + 1) {
                criarNovaLoja();
                return;
            }
            if (opcao > 0 && opcao <= lojas.size()) {
                acessarMenuLoja(opcao - 1);
                return;
            } else {
                System.out.println("Opção inválida!");
            }


        }

    }

    private static void acessarMenuLoja(int indiceLoja) {
        if (indiceLoja < 0 || indiceLoja >= lojas.size()) {
            System.out.println("Loja inválida!");
            return;
        }

        Loja lojaAtual = lojas.get(indiceLoja);

        int opcaoMenuLoja;

        while (true) {
            System.out.println("\n\nMenu Loja: " + lojaAtual.getNomeFantasia());
            System.out.println("-----------------");

            System.out.println("1. Cadastrar Gerente");
            System.out.println("2. Cadastrar Vendedores");
            System.out.println("3. Cadastrar Novo Cliente");
            System.out.println("4. Cadastrar Novo Item");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Itens");
            System.out.println("7. Listar Vendedores");
            System.out.println("8. Criar Novo Pedido");
            System.out.println("9. Processar Novo Pedido");
            System.out.println("0. Voltar para o Menu Principal");

            System.out.print("Digite sua opção: ");
            opcaoMenuLoja = new Scanner(System.in).nextInt();
            if (opcaoMenuLoja == 0) {
                menuPrincipal();
                return;
            }
        }
    }

    private static void criarNovaLoja() {
        System.out.println("Digite o nome fantasia da nova loja: ");
        String nomeFantasia = new Scanner(System.in).nextLine();

        System.out.println("Digite a razão social da nova loja: ");
        String razaoSocial = new Scanner(System.in).nextLine();

        System.out.println("Digite o CNPJ da nova loja: ");
        String cnpj = new Scanner(System.in).nextLine();

        System.out.println("Digite o estado do endereço da loja: ");
        String enderecoEstado = new Scanner(System.in).nextLine();

        System.out.println("Digite a cidade do endereço da loja: ");
        String enderecoCidade = new Scanner(System.in).nextLine();

        System.out.println("Digite o bairro do endereço da loja: ");
        String enderecoBairro = new Scanner(System.in).nextLine();

        System.out.println("Digite o endereço da loja (rua): ");
        String enderecoRua = new Scanner(System.in).nextLine();

        System.out.println("Digite o número do endereço da loja: ");
        Integer enderecoNumero = new Scanner(System.in).nextInt();

        System.out.println("Digite o complemento do endereço da loja: ");
        String enderecoComplemento = new Scanner(System.in).nextLine();

        Endereco endereco = Endereco.EnderecoBuilder.builder()
                .estado(enderecoEstado)
                .cidade(enderecoCidade)
                .bairro(enderecoBairro)
                .rua(enderecoRua)
                .numero(enderecoNumero)
                .complemento(enderecoComplemento)
                .build();

        Loja lojanova = Loja.LojaBuilder.builder()
                .nomeFantasia(nomeFantasia)
                .razaoSocial(razaoSocial)
                .cnpj(cnpj)
                .endereco(endereco)
                .build();

        lojas.add(lojanova);

        System.out.println("Nova loja criada com sucesso!");
        menuPrincipal();
    }
}


