public class ProdutoTestar {
    public static void main(String[] args) {
        //contrutor padrão
        Produto p1 = new Produto();
        p1.nome = "caneta preta";
        p1.marca="bic";
        p1.valor =1.99f;

        //contrutor de dois paramentros
        Produto p2= new Produto("caneta","fabel");
        p2.valor = 1.67f;

        //construtor de tres parametros
        Produto p3 = new Produto("borracha", "eco",10.90f);

        //obejto p1
        System.out.println("Nome \n"+ p1.nome+ "\nMarca "+ p1.marca+ "\nValor"+p1.valor);

        //obejto p2
        System.out.println("Nome \n"+ p2.nome+ "\nMarca "+ p2.marca+ "\nValor"+p2.valor);

        //obejto p3
        System.out.println("Nome \n"+ p3.nome+ "\nMarca "+ p3.marca+ "\nValor"+p3.valor);
    }
}
