public class App {

    public static void main(String[] args) {

        // Criação dos objetos herdeiros de Funcionario
        Engenheiro e = new Engenheiro("12345","Fulano da Silva",
                                      15000.0);
        Vendedor v = new Vendedor("56789", "Mickey",
                                  30000.0, 0.10);
        Horista h = new Horista("65432", "Pateta",
                                 40, 100.0);

        // Criação do objeto Empresa
        Empresa sptech = new Empresa();

        sptech.adicionaFunc(e);
        sptech.adicionaFunc(v);
        sptech.adicionaFunc(h);

        sptech.exibeTodos();
        sptech.exibeTotalSalario();
        sptech.exibeHoristas();

        // Busca de funcionário por CPF
        System.out.println("\nBusca do funcionário de CPF 56789:");
        sptech.buscaFunc("56789");

        System.out.println("\nBusca do funcionário de CPF 77777:");
        sptech.buscaFunc("77777");



    }
}
