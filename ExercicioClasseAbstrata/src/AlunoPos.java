public class AlunoPos extends Aluno{
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunoPos(String nome, Integer ra, Double nota1, Double nota2, Double notaMonografia) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }


    //metodo calcular nota
    public Double calcularMedia(){
        return (this.getNota1() + this.getNota2() + this.getNotaMonografia()) /3;
    }

    //metodo de acesso get and set
    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }

    //toString
    @Override
    public String toString() {
        return "Resultado {" +
                "Nota 1=" + nota1 +
                "Nota 2=" + nota2 +
                "Nota Monografia=" + notaMonografia +
                "} " + super.toString();
    }
}
