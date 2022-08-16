public class DVD extends Produto{
    //Atributos
    private String nome;
    private String gravadora;

    //Contrutor

    public DVD(int codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    //Métodos de acesso Get and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    //Método getValorVenda
    @Override
    public Double getValorVenda() {
        return getPrecoCusto() * 2.20;
    }

    //toString

    @Override
    public String toString() {
        return " Nome:{" +
                nome +
                "Gravadora" +
                gravadora +
                "Valor da venda" +
                getValorVenda()+
                "}" + super.toString();
    }


}
