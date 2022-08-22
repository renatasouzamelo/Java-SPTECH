package sptech.projeto02;


import org.springframework.web.bind.annotation.*;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {
    //URI SEMPRE NO PLURAL

    //Gerador de ID
    private UUID id= UUID.randomUUID();
    private List<Investimento> investimentos = new ArrayList<>();

    @GetMapping  //Método: GET - URI: /investimento
    public List<Investimento> getInvestimentos() {
        return investimentos;
    }

    //Cadastro via API
    @PostMapping // Método Post -URI: /investimentos
    public Investimento posttInvestimento(@RequestBody Investimento novoInvest) {
        investimentos.add(novoInvest);
        return novoInvest;
    }
    @GetMapping("/{posicao}")
    public Investimento getInvestimento(@PathVariable int posicao){
        return investimentos.get(posicao);

    }

    @DeleteMapping("/{posicao}")
    public String delete(@PathVariable int posicao){
        investimentos.remove(posicao);
        return "Excluido com sucesso";

    }

    //MÉTODO PUT - URI: /investimentos/{posicao}

    @PutMapping("/{posicao}")
    public Investimento putInvestimento(@PathVariable int posicao, @RequestBody Investimento update){
         investimentos.set(posicao, update);
         return update;
    }
}
