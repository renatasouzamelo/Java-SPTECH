public class TesteAluno {
    public static void main(String[] args) {
        // Criação dos objetos herdeiros de Aluno
        AlunoFundamental aluno1 = new AlunoFundamental("Renata",
                123456, 10.0, 9.8, 9.9, 9.8);

        AlunoGraduacao aluno2 = new AlunoGraduacao("Fabio",
                123789, 7.0, 9.8);

        AlunoPos aluno3 = new AlunoPos("Sara",
                123321, 9.8, 9.8, 9.7);

        // Criação do objeto Escola
        Escola fund1 = new Escola("Maria Amelia");
        Escola usp = new Escola("Usp");
        Escola unicamp = new Escola("Unicamp");


        //calcular media
        aluno3.calcularMedia();
        aluno2.calcularMedia();
        aluno1.calcularMedia();

        //metodos implementados na classe escola
        fund1.exibirAlunos();
        usp.exibirAlunosGraduacao();
        unicamp.exibirAlunosAprovados();
        unicamp.adicionarAluno(aluno1);
        usp.adicionarAluno(aluno2);
        fund1.adicionarAluno(aluno3);
        usp.buscarAluno(123456);

        //printar na tela
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);



    }
}
