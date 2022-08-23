public abstract class Professor implements Ibonus {

    private String nome;
    private Double valorHoraAula;
    private int qtdHorasSemanal;

    //Construtor

    public Professor(String nome, Double valorHoraAula, int qtdHorasSemanal) {
        this.nome = nome;
        this.valorHoraAula = valorHoraAula;
        this.qtdHorasSemanal = qtdHorasSemanal;
    }

    // Método Bonus
    @Override
    public Double getValorBonus() {
        return (valorHoraAula * valorHoraAula) + getValorBonus() *1.10;
    }

    //Get and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public int getQtdHorasSemanal() {
        return qtdHorasSemanal;
    }

    public void setQtdHorasSemanal(int qtdHorasSemanal) {
        this.qtdHorasSemanal = qtdHorasSemanal;
    }

    //ToString

    @Override
    public String toString() {
        return " Nome:{" +
                nome +
                "Valor" +
                valorHoraAula +
                "Horas semanais"+
                qtdHorasSemanal+
                "Valor com bonus"+
                 getValorBonus() +
                "}" + super.toString();
    }
}
