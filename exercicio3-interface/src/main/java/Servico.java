public class Servico implements Vendavel {
    //Atributos
    private String descricao;
    private int codigo;
    private int qtdaHoras;
    private Double valorHora;


    //Construtor

    public Servico(String descricao, int codigo, int qtdaHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdaHoras = qtdaHoras;
        this.valorHora = valorHora;
    }

    // Métodos de acesso get and setter

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdaHoras() {
        return qtdaHoras;
    }

    public void setQtdaHoras(int qtdaHoras) {
        this.qtdaHoras = qtdaHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }


    // Método que calcula o valor da venda
    @Override
    public Double getValorVenda() {
        return getQtdaHoras() * getValorHora();
    }

    //toString
    @Override
    public String toString() {
        return " Descrição{" +
                descricao +
                "Código" +
                codigo +
                "Quantidade de horas" +
                getQtdaHoras() +
                "Valor da hora" +
                getValorHora() +
                "Valor da venda"+
                getValorVenda()+
                "}" + super.toString();
    }
}
