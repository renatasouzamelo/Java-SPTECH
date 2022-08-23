package sptech.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cantores")
public class CantorController {
    private List<Cantor> cantores = new ArrayList<>();

    @PostMapping
    public Cantor post(@RequestBody Cantor novoCantor) {
        novoCantor.setId(cantores.size() + 1);
        cantores.add(novoCantor);

        return novoCantor;
    }

    @GetMapping("/{id}")
    public Cantor get(@PathVariable int id) {
        for (Cantor cantor : cantores) {
            if (cantor.getId() == id) {
                return cantor;
            }
        }
        return null;
    }

    //@GetMapping("/{id}")
    public Cantor getModerno(@PathVariable int id) {
        // solução com stream
        return cantores.stream()
                .filter(cantor -> cantor.getId() == id)
                .findFirst().orElse(null);
    }

    @GetMapping("/celebridades")
    public List<Cantor> getCelebridades() {
        List<Cantor> celebridades = new ArrayList<>();
        for (Cantor cantor : cantores) {
            if (cantor.getCache() > 100_000) {
                celebridades.add(cantor);
            }
        }
        return celebridades;
    }

    //@GetMapping("/celebridades")
    public List<Cantor> getCelebridadesModerno() {
        List<Cantor> celebridades = cantores.stream()
                .filter(cantor -> cantor.getCache() > 100_000)
                .collect(Collectors.toList());
        return celebridades;
    }

    @PutMapping("/{id}")
    public Cantor put(@PathVariable int id,
                      @RequestBody Cantor atualizado) {
        for (Cantor cantor : cantores) {
            if (cantor.getId() == id) {
                cantor.setNome(atualizado.getNome());
                cantor.setCache(atualizado.getCache());
                // todos os campos menos o id

                return cantor;
            }
        }
        return null;
    }
}