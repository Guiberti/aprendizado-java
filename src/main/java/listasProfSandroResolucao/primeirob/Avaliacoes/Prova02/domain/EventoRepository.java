package listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class EventoRepository {
    private final List<Evento> eventos = new ArrayList<>();

    public void save(Evento evento) {
        eventos.add(evento);
    }

    public Optional<Evento> findById(int id) {
        return eventos.stream().filter(evento -> Objects.equals(evento.getId(), id)).findFirst();
    }

    public List<Evento> findAll() {
        return new ArrayList<>();
    }


    public void deleteById(int id) {
        eventos.removeIf(evento -> evento.getId() == id);
    }

}
