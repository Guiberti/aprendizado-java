package listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ClienteRepository {
    private final List<Cliente> clientes = new ArrayList<>();

    public void save(Cliente cliente) {
        clientes.add(cliente);
    }

    public Optional<Cliente> findByName(String name) {
        return clientes.stream().filter(cliente -> Objects.equals(cliente.getNome(), name)).findFirst();
    }

    public List<Cliente> findAll() {
        return new ArrayList<>();
    }


    public void deleteById(int id) {
        clientes.removeIf(cliente -> cliente.getId() == id);
    }

}
