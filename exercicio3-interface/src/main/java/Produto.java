public abstract class Produto implements Vendavel {
    //Atributos
    private int codigo;
    private Double precoCusto;


    //Construtor
    public Produto(int codigo, Double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }


    //Método getPreçoCusto

    @Override
    public Double getValorVenda() {
        return getPrecoCusto() * 1.10;
    }

    //Get and setter

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    //toString
    @Override
    public String toString() {
        return " Código{" +
                codigo +
                "Preço do custo" +
                precoCusto +
                getPrecoCusto()+
                "}" + super.toString();
    }
}