package sptech.projetojpa01.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.projetojpa01.dominio.Anime;



public interface AnimeRepository extends JpaRepository<Anime, Integer> {

}
