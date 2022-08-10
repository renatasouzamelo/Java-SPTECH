public abstract class Produto implements Tributavel {
    //Atributos
    private int codigo;
    private String descricao;
    private Double preco;

    //Construtor
    public Produto(int codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    //Métodos




    // Getter preço

    public Double getPreco() {
        return preco;
    }
}
