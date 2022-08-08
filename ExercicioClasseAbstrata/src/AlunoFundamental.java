public class AlunoFundamental extends Aluno {

    private Double nota1;
    private Double nota2;

    private Double nota3;

    private Double nota4;

    public AlunoFundamental(String nome, Integer ra, Double nota1, Double nota2, Double nota3, Double nota4) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }


    //metodos calcular nota
    public Double calcularMedia(){
        return this.getNota2() + this.getNota2() + this.getNota3() + this.getNota4() /4;
    }

    //metodos de acesso get and set
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

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    //toString
    @Override
    public String toString() {
        return "Resultado {" +
                "Nota 1=" + nota1 +
                "Nota2=" + nota2 +
                "Nota 3=" + nota3 +
                "Nota 4=" + nota4 +
                "} " + super.toString();
    }



}








