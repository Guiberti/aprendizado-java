package listasProfSandroResolucao.Lista05.test;

import listasProfSandroResolucao.Lista05.domain.Cliente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {

    @Test
    public void testarApresentarse(){
        Cliente cliente = Cliente.ClienteBuilder.builder()
                .NomePessoa("Joao")
                .Idade(35)
                .Cidade("Sta Lucia")
                .Bairro("Centro")
                .Rua("Av OLZ")
                .build();

        String resultadoEsperado = "Meu nome é: Joao, minha idade é: 35.";
        String resultadoAtual = cliente.apresentarse();

        assertEquals(resultadoEsperado, resultadoAtual);

    }
}
