public abstract class Funcionario {

    private String nomeFunc;
    private Double qtdaHoraSemanal;
    private Double valorHoraAula;


    public Funcionario(String nomeFunc, Double qtdaHoraSemanal, Double valorHoraAula) {
        this.nomeFunc = nomeFunc;
        this.qtdaHoraSemanal = qtdaHoraSemanal;
        this.valorHoraAula = valorHoraAula;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public Double getQtdaHoraSemanal() {
        return qtdaHoraSemanal;
    }

    public void setQtdaHoraSemanal(Double qtdaHoraSemanal) {
        this.qtdaHoraSemanal = qtdaHoraSemanal;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }


    // metodo abstrato
    public abstract Double calcSalario();


    @Override
    public String toString() {
        return " Nome:{" +
                nomeFunc +
                "Quantidade de horas" +
                 qtdaHoraSemanal +
                "Valor da hora"+
                valorHoraAula +
                "}" + super.toString();
    }
}
