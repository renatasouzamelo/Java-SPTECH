package sptech.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cantores")

public class cantorController {

    private List<Cantor> cantores = new ArrayList<>();

    @GetMapping  //Método: GET - URI: /investimento
    public List<Cantor> getCantores() {
        return cantores;
    }

    @PostMapping("/cantores")
    public Cantor postCantor(@RequestBody Cantor novoCantor) {
        cantores.add(novoCantor);
        novoCantor.setId(cantores.size() + 1);
        return novoCantor;
    }

    @GetMapping("/{id}")
    public Cantor getCantor(@PathVariable int id) {
        for (Cantor cantor : cantores) {

            if (cantor.getId() == id) {
                return cantor;

            }

        }
        return null;

    }

    @GetMapping("/celebridades")
    public List <Cantor> getCelebridades () {
        List<Cantor> celebridades = new ArrayList<>();
        for (Cantor cantor : cantores) {
            if (cantor.getCache() > 100_000) {
                celebridades.add(cantor);

            }
        }
        return celebridades;
    }

    @PutMapping("/{id}")
    public Cantor putCantor(@PathVariable int id, @RequestBody Cantor updateCantor){
        for(Cantor cantor: cantores){
            if (cantor.getId() ==id){
                cantor.setCache(updateCantor.getCache());
                cantor.setNome(updateCantor.getNome());

                return cantor;
            }
        }
        return null;

    }

}
