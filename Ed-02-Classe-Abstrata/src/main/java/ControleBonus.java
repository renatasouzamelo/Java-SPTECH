import java.util.ArrayList;
import java.util.List;

    public class ControleBonus {
        //Atributo
        private List<Ibonus> bonus;

        //Construtor

        public ControleBonus(List<Ibonus> bonus) {
            this.bonus = bonus;
        }

        public ControleBonus() {

        }


        //Método adicionar
        public void adicionarBonus(Ibonus bonus1){
            System.out.println("Exibir vendas adicionadas");
            bonus.add(bonus1);

        }

        //Método calcular
        public Double calcularTotalVenda(){
            System.out.println("Exibir valor total de vendas");
            Double valorTotalVendas = 0.00;
            for (Ibonus bonus1 : bonus){
                valorTotalVendas += bonus1.getValorBonus();
            } return valorTotalVendas;
        }

        //Método exibir itens do carrinho
        public void exibirItensCarrinho(){
            System.out.println("Exibir itens do carrinho");
            for (Ibonus bonus1 : bonus){
                System.out.println(bonus1);
            }

        }
    }

