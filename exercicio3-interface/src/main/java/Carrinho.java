import java.util.ArrayList;
import java.util.List;

public class Carrinho {
        //Atributo
        private List<Vendavel> cart;

        //Construtor

    public Carrinho(List<Vendavel> cart) {
        this.cart = cart;
    }

    public Carrinho() {

    }


    //Método adicionar
        public void adicionarVendavel(Vendavel v){
            System.out.println("Exibir vendas adicionadas");
            cart.add(v);

        }

        //Método calcular
       public Double calcularTotalVenda(){
           System.out.println("Exibir valor total de vendas");
        Double valorTotalVendas = 0.00;
        for (Vendavel v : cart){
            valorTotalVendas += v.getValorVenda();
        } return valorTotalVendas;
        }

        //Método exibir itens do carrinho
        public void exibirItensCarrinho(){
            System.out.println("Exibir itens do carrinho");
            for (Vendavel v : cart){
                System.out.println(v);
            }

        }
}
