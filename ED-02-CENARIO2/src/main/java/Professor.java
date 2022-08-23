public class Professor extends Funcionario {
     //Atributo
     private String nomeProf;

    //Construtor
    public Professor(String nomeFunc, Double qtdaHoraSemanal, Double valorHoraAula, String nomeProf) {
        super(nomeFunc, qtdaHoraSemanal, valorHoraAula);
        this.nomeProf = nomeProf;
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
                nomeProf +
                "Salário"+
                calcSalario()+
                "}" + super.toString();
    }
}