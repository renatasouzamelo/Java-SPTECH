public class Livro extends Produto{
    //Atributos
    private String nome;
    private String autor;
    private String isbn;

    //Construtor
    public Livro(int codigo, Double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    //Métodos de acesso get and setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //Método getValorVenda
    @Override
    public Double getValorVenda() {
        return getPrecoCusto() * 1.10;
    }


    //toString
    @Override
    public String toString() {
        return " Nome:{" +
                nome +
                "Autor" +
                autor +
                "isbn:" +
                isbn +
                "Valor da venda" +
                getValorVenda()+
                "}" + super.toString();
    }
}
