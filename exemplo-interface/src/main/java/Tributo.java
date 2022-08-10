
import java.util.ArrayList;
import java.util.List;
public class Tributo {
    //Atributo
    private List<Tributavel> lista;

    //construtor
    public Tributo() {
        lista = new ArrayList<Tributavel>();
    }

    //Métodos
    public void adicionarTributavel(Tributavel tributo){
        this.lista.add(tributo);

    }

    public Double calcularTributo(){
        Double valorTotal= 0.00;
        for (Tributavel tributo :lista){
            valorTotal += tributo.getValorATributo();
        } return valorTotal;
    }

    public void exibirTodos(){
        System.out.println("Exibir todos os tributáveis");
        for (Tributavel tributo : lista){
            System.out.println(tributo);
        }
    }
}
