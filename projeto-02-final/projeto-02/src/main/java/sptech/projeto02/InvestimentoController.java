package sptech.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {

    private List<Investimento> investimentos
                                = new ArrayList<>();

    @GetMapping // Método: GET - URI: /investimentos
    public List<Investimento> getInvestimentos() {
        return investimentos;
    }

    @PostMapping // Método: POST - URI: /investimentos
    public Investimento postInvestimento(
                            @RequestBody Investimento novo) {
        investimentos.add(novo);
        return novo;
    }
/*
Método: PUT
URI: /investimentos/{posicao}
JSON de Investimento no corpo de requisição
- Atualiza o investimento na posição indicada com
  os dados do JSON enviado
- Retorna o JSON do investimento atualizado
 */

    // Método: GET - URI: /investimentos/{posicao}
    @GetMapping("/{posicao}")
    public Investimento get(@PathVariable int posicao) {
        return investimentos.get(posicao);
    }

    // Método: DELETE - URI: /investimentos/{posicao}
    @DeleteMapping("/{posicao}")
    public Investimento delete(@PathVariable int posicao) {
        return investimentos.remove(posicao);
    }

    // Método: PUT - URI: /investimentos/{posicao}
    @PutMapping("/{posicao}")
    public Investimento put(@PathVariable int posicao,
                            @RequestBody Investimento investimento) {
        investimentos.set(posicao, investimento);
        return investimento;
    }



}
