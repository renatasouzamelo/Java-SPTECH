import java.util.Scanner;

public class TesteScanner {

    public static void main(String[] args) {
        Integer numero1, numero2, numero3;
        String nome;
        Double nota;
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);

        System.out.println("Digite 3 números");
        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();
        numero3 = leitor.nextInt();

        System.out.printf("Numero1: %d, Numero2: %d, Numero3: %d\n",
                           numero1, numero2, numero3);
        System.out.println("Digite o nome");
        nome = leitorNL.nextLine();
        System.out.println("Digite uma nota");
        nota = leitor.nextDouble();




    }
}
