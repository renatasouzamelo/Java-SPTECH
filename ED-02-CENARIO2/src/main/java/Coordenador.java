public class Coordenador extends Funcionario{
    //Atributo
    private String nomeCoord;

    //Construtor


    public Coordenador(String nomeFunc, Double qtdaHoraSemanal, Double valorHoraAula, String nomeCoord) {
        super(nomeFunc, qtdaHoraSemanal, valorHoraAula);
        this.nomeCoord = nomeCoord;
    }

    //método abstrato
    @Override
    public Double calcSalario() {
        return getQtdaHoraSemanal() * getValorHoraAula();
    }

    //toString

    @Override
    public String toString() {
        return " Nome:{" +
                nomeCoord +
                "Salário"+
                calcSalario()+
                "}" + super.toString();
    }
}
