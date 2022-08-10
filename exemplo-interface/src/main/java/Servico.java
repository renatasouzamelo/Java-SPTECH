public class Servico implements Tributavel {
    //Atributos
    private String descricao;
    private Double preco;

    //Construtor
    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    //Métodos de calculo de atributo

    @Override
    public Double getValorATributo() {
        return preco * 0.12;
    }

    //toString
    @Override
    public String toString() {
        return " Descrição{" +
                descricao +
                "Preço" +
                preco +
                "Tributo"+
                getValorATributo() +
                "}" + super.toString();
    }
}
