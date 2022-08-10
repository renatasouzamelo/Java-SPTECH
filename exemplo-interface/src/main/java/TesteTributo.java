public class TesteTributo {

    public static void main(String[] args) {
        //Criação de objetos tributáveis
        Alimento m2= new Alimento(1,"Maçã",10.99,2);

        Perfume t2 = new Perfume(1,"Victoria Secrets", 109.99, "amadeirado");

        Servico t5 = new Servico("Delivery",109.99);

        Tributo Imposto= new Tributo();

        Imposto.adicionarTributavel(m2);
        Imposto.adicionarTributavel(t2);
        Imposto.adicionarTributavel(t5);

        Imposto.exibirTodos();

        System.out.println("Total de tributos" +
                String.format("R$ %.2f",Imposto.calcularTributo()));

        System.out.printf("Total de tributos: R$ %.2f",
                            Imposto.calcularTributo());

        //souf = printf



    }
}
