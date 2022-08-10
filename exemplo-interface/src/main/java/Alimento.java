public class Alimento extends Produto {
    // Atributo
    private Integer quantVitamina;

    // Construtor

    public Alimento(int codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }


    //Métodos


    //Implementação do método getValorATributo


    @Override
    public Double getValorATributo() {
        return getPreco() * 0.15;
    }

    //toString
    @Override
    public String toString() {
        return " Alimento{" +
                "quantVitamina" +
                quantVitamina +
    "}" + super.toString();
    }
}
