public class Perfume extends Produto{

    //Atributos
    public String fragrancia;

    //Construtor

    public Perfume(int codigo, String descricao, Double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }


    // Métodos


    @Override
    public Double getValorATributo() {
        return getPreco()*0.27;
    }

    //toString
    @Override
    public String toString() {
        return " Perfume{" +
                "Fragância" +
                fragrancia+
                "}" + super.toString();
    }
}
