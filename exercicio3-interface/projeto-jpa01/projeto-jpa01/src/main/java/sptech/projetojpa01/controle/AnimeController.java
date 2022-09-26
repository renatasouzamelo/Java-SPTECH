package sptech.projetojpa01.controle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.projetojpa01.dominio.Anime;
import sptech.projetojpa01.repositorio.AnimeRepository;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimeController {
    @Autowired
    private AnimeRepository repository;

    @PostMapping
    public ResponseEntity<Anime> post(@RequestBody Anime novoAnime) {
        repository.save(novoAnime);
        return ResponseEntity.status(201).body(novoAnime);
    }

    @GetMapping
    public ResponseEntity<List<Anime>> get() {
        List<Anime> lista = repository.findAll();
        return lista.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime>get(@PathVariable int id){
        return ResponseEntity.of(repository.findById(id));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Anime> delete(@PathVariable int id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Anime> put(@PathVariable int id,
                                   @RequestBody Anime anime ){
        if (repository.existsById(id)){
            anime.setIdAnime(id);
            repository.save(anime);
            return ResponseEntity.status(200).body(anime);
        }
        return ResponseEntity.status(404).build();
    }

}


