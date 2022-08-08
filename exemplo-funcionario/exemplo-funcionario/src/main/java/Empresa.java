import java.util.ArrayList;
import java.util.List;

public class Empresa {

    // Atributos
    private List<Funcionario> lista;

    // Construtor
    public Empresa() {
        lista = new ArrayList<Funcionario>();
    }

    // Métodos

    // Método adicionaFunc
    public void adicionaFunc(Funcionario f) {
        lista.add(f);
    }

    // Método exibeTodos()
    public void exibeTodos() {
        System.out.println("\nLista de funcionários:");
        for (Funcionario f : lista) {
            System.out.println(f);
        }
    }

    // Método exibeTotalSalario()
    public void exibeTotalSalario() {
        Double total = 0.0;
        for (Funcionario f : lista) {
            total += f.calcSalario();
        }
        System.out.println("\nTotal dos salários: " +
                           String.format("R$ %.2f", total));
    }

    // Método exibeHoristas()
    public void exibeHoristas() {
        System.out.println("\nLista de horista:");
        for (Funcionario f : lista) {
            if (f instanceof Horista) {
                System.out.println(f);
            }
        }
    }

    /* Método buscaFunc - este método não tem no diagrama de classes
       Recebe um cpf e procura por um funcionário com esse CPF.
       Se encontrar, exibe os dados do funcionário
       Se não encontrar, exibe mensagem de não encontrado
     */
    public void buscaFunc(String cpf) {
        Boolean achou = false;
        for (Funcionario f : lista) {
            if (f.getCpf().equals(cpf)) {
                System.out.println(f);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Não encontrado!");
        }
    }

}
