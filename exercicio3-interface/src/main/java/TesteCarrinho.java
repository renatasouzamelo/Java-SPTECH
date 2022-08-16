import java.util.Scanner;
public class TesteCarrinho {

    public static void main(String[] args) {
        //Criação de objetos Vendaveis
        Livro l1 = new Livro(1, 10.99, "Mémorias póstumas de Braz Cubas",
                "Machado de Assis", "12d345f");
        Livro l2 = new Livro(2, 13.99, "Geração de valor",
                "Flavio Augusto", "12d675f");

        DVD d1 = new DVD(10,11.90, "Legião Urbana", "Sony");
        DVD d2 = new DVD(11,12.90, "Coldplay", "Sony");

        Carrinho cart = new Carrinho();

        cart.adicionarVendavel(l1);
        cart.adicionarVendavel(l2);

        Scanner leitorInteiro = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();

        Integer opcao = 1;

        while(opcao > 0 && opcao <6){

            System.out.println("CARRINHO\n" +
                    "1 - Adiciona Livro;\n" +
                    "2 - Adiciona DVD;\n" +
                    "3 - Adiciona Servico;\n" +
                    "4 - Exibe itens do Carrinho;\n" +
                    "5 - Exibe total de vendas;\n" +
                    "6 - Fim\n");
            System.out.println("Digite uma das opções a seguir: ");
            opcao = leitorInteiro.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Digite o nome do livro:");
                    String nomeDoLivro = leitorString.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autorDoLivro = leitorString.nextLine();
                    System.out.println("Digite o isbn do livro:");
                    String isbnDoLivro = leitorString.nextLine();
                    Livro livro = new Livro(1,12.99,"A mão e a Luva",
                            "Machado de Assis","123455");
                    cart.adicionarVendavel(l1);
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o nome do DVD que deseja cadastrar:");
                    String nomeDVD = leitorString.nextLine();
                    System.out.println("Digite a gravadora do DVD que deseja cadastrar:");
                    String gravadoraDVD = leitorString.nextLine();
                    DVD dvd = new DVD(2,39.90,"Paralamas do sucesso",
                            "Sony");
                    cart.adicionarVendavel(d1);
                    System.out.println("DVD cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Digite a descrição do serviço:");
                    String descricaoServico = leitorString.nextLine();
                    System.out.println("Digite o código do serviço:");
                    Integer codigoServico = leitorInteiro.nextInt();
                    System.out.println("Digite a quantidade de Horas:");
                    Integer quantHorasServico = leitorInteiro.nextInt();
                    System.out.println("Digite o valor da hora do serviço:");
                    Double valorHora = leitorInteiro.nextDouble();
                    Servico servico = new Servico("Entrega",3,12,
                            49.90);
                    cart.adicionarVendavel(servico);
                    System.out.println("Serviço cadastrado com sucesso");
                    break;

                case 4:
                    cart.exibirItensCarrinho();
                    break;

                case 5:
                    cart.calcularTotalVenda();
                    break;

                default:
                    System.out.println("Sair");
                    break;

            }

        }

    }
}

