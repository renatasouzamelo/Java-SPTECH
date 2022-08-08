public abstract class Aluno{
    //atributos
    private String nome;
    private Integer ra;
    private boolean ativo;

    private Double calcularMedia;


    //construtor

    public Aluno(String nome, Integer ra, Double calcularMedia, boolean ativo) {
        this.nome = nome;
        this.ra = ra;
        this.ativo = ativo;
        this.calcularMedia = calcularMedia;
    }

    public Aluno(String nome, Integer ra) {
    }

    //metodos de acesso get and set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Double getCalcularMedia() {
        return calcularMedia;
    }

    public void setCalcularMedia(Double calcularMedia) {
        this.calcularMedia = calcularMedia;
    }

    //metodos abstrato
    public abstract Double calcularMedia();

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aluno{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", ra=").append(ra);
        sb.append('}');
        return sb.toString();
    }
}
