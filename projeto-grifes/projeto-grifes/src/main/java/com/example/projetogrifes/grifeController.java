package com.example.projetogrifes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/grifes")
public class grifeController {

    List<Grife> listaGrifes = new ArrayList<>();

    @PostMapping
    public Grife postGrife(@RequestBody Grife novaGrife) {
        listaGrifes.add(novaGrife);
        return novaGrife;
    }

    @GetMapping
    public List<Grife> getGrifes() {
        return listaGrifes;
    }

    @PutMapping("{posicao}")
    public String putGrife(@PathVariable int posicao, @RequestBody Grife novaGrife) {
        if (posicao < listaGrifes.size()) {
            listaGrifes.set(posicao, novaGrife);
            return "atualizado com sucesso";
        } else {
            return "Indice não encontrado";
        }
    }

    @DeleteMapping("{posicao}")
    public String deleteGrife(@PathVariable int posicao){
        if (posicao < listaGrifes.size()){
            listaGrifes.remove(posicao);
            return "Grife deletado com sucesso";
        }else {
            return "Indice não encontrado";
        }
    }
}

