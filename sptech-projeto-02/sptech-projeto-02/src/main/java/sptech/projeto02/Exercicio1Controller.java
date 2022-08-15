package sptech.projeto02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio1Controller {

    @GetMapping("/pode-votar/{idade}")
    public Boolean podeVotar(@PathVariable int idade) {
        return idade >= 16;

    }

    @GetMapping("/imc/{peso}/{altura}")
    public double imc(@PathVariable Double peso,
                      @PathVariable Double altura) {
        return peso / Math.pow(altura, 2);
    }

    @GetMapping("/analise-campanha/{vit}/{emp}/{derr}")
    public String campanha(@PathVariable int vit,
                           @PathVariable int emp,
                           @PathVariable int derr) {

        int totaPontos = (vit + emp + derr) * 3;
        int pontoObtidos = vit * 3 + emp;

        double aproveitamento = (double) pontoObtidos / totaPontos * 100;
        return "O total de aproveitamento é" + aproveitamento + "%";
        //No Java a dvisão de 2 ints ou Integers sempre resulta em Integer ou int
    }

    }
