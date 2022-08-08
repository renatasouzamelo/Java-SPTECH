public class AlunoGraduacao extends Aluno{
    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(String nome, Integer ra, Double nota1, Double nota2) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
   //metodo calcular nota
   public Double calcularMedia(){
       return this.getNota1() *0.4 + this.getNota2() *0.6;
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

    //toString
    @Override
    public String toString() {
        return "Resultado {" +
                "Nota 2=" + nota1 +
                ", Media=" + nota2 +
                "} " + super.toString();
    }
}
