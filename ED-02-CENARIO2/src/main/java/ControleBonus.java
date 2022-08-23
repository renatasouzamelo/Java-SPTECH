import java.util.ArrayList;
import java.util.List;

    public class ControleBonus {
        //Atributo
        private List<Funcionario> bonusFunc;

        //Construtor

        public ControleBonus(List<Funcionario> bonusFunc) {
            this.bonusFunc = bonusFunc;
        }

        public ControleBonus() {

        }

        //Método calcular
        public Double calcularTotalVenda(){
            System.out.println("Exibir valor total de vendas");
            Double valorTotal = 0.00;
            for (Funcionario bonus1 : bonusFunc){
                valorTotal += bonus1.getValorHoraAula()* bonus1.getQtdaHoraSemanal();
            } return valorTotal;
        }

        //Método exibir itens do carrinho
        public void exibirItensCarrinho(){
            System.out.println("Exibir itens do carrinho");
            for (Funcionario bonus1 : bonusFunc){
                System.out.println(bonus1);
            }

        }
    }



