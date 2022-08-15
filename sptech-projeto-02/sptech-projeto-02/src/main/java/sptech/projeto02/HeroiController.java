package sptech.projeto02;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;


@RestController
@RequestMapping("/herois")
public class HeroiController {

    private List<Heroi> herois = new ArrayList<>((List.of(
            new Heroi("Heroi A", "VOAR", 100.0, true),
            new Heroi("Heroi B", "VOAR", 100.0, true),
            new Heroi("Heroi C", "VOAR", 100.0, true)
    )));

    public List<Heroi> getHerois() {
        return herois;
    }

    @GetMapping("/favorito")
    public Heroi heroiFavorito() {
        Heroi favorito = new Heroi("Homem Aranha", "força", 100.0, true);

        return favorito;
    }

    @GetMapping("/{indice}")
    public Heroi getHeroi(@PathVariable int indice) {
        if (indice >= 0 && indice < herois.size()) {
            return herois.get(indice);
        } else {
            return null;
        }
    }

    @GetMapping("/cadastrar/{nome}/{poder}/{forca}/{vivo}")
    public Heroi getCadastrar(@PathVariable String nome,
                              @PathVariable String poder,
                              @PathVariable double forca,
                              @PathVariable boolean vivo) {
        Heroi novoHeroi = new Heroi("Hulk", "Força", 100.0, true);

        herois.add(novoHeroi);

        return novoHeroi;

    }

    //Chamada: para atualizar dados do Heroi na posição do indice
    @GetMapping("/atualizar/{indice}/{nome}/{poder}/{forca}/{vivo}")
    public Heroi getAtualizar(@PathVariable int indice,
                              @PathVariable String nome,
                              @PathVariable String poder,
                              @PathVariable Double forca,
                              @PathVariable Boolean vivo) {


        if (indice >= 0 && indice < herois.size()) {
            Heroi heroiAtualizado = new Heroi("Hulk", "Força", 100.0, true);

            herois.set(indice, heroiAtualizado);

            return heroiAtualizado;

        }
        return null;
    }

}
