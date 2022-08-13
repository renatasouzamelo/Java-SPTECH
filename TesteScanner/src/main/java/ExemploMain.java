public class ExemploMain {

    public static void main(String[] args) {
        // Criar uma variável inteira opcao
        // Criar uma variável para cada atributo de Livro, DVD, Servico
        // Criar um leitor da classe Scanner para usar com nextInt(), nextDouble(), next()
        // Criar um leitorNL da classe Scanner para usar com nextLine()
        // Criar uma variável booleana fim e inicializar com false
        // Criar um objeto da classe Carrinho

        while (!fim) {
            // Exibe o menu
            // Pede para o usuário digitar a opção
            // Lê a opcao
            switch (opcao) {
                case 1:
                    // Solicita ao usuário digitar os valores dos atributos do livro
                    // Ler cada um desses valores
                    // Criar um objeto livro com esses atributos
                    // Adicionar esse objeto livro ao objeto carrinho
                    break;
                case 2: // idem ao case 1, para DVD
                    break;
                case 3: // idem ao case 1, para Servico
                    break;
                case 4:
                    // chama o método exibeItensCarrinho do objeto carrinho
                    break;
                case 5:
                    // chama o método calculaTotalVenda e exibe o retorno desse método
                    break;
                case 6:
                    fim = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}
