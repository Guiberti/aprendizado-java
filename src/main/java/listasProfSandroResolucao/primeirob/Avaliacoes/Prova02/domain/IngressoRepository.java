package listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class IngressoRepository {
    private final List<Ingresso> ingressos = new ArrayList<>();

    public void save(Ingresso ingresso) {
        ingressos.add(ingresso);
    }

    public Optional<Ingresso> findById(int id) {
        return ingressos.stream().filter(ingresso -> Objects.equals(ingresso.getId(), id)).findFirst();
    }

    public List<Ingresso> findAll() {
        return new ArrayList<>();
    }


    public void deleteById(int id) {
        ingressos.removeIf(ingresso -> ingresso.getId() == id);
    }
}
