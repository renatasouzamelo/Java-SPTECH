import java.util.ArrayList;
import java.util.List;

public class Escola {
    //atributos
    private String nome;
    private List<Aluno> alunos;

    //construtor
    public Escola(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<Aluno>();
    }

    //metodo adicionar aluno
    public void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void exibirAlunos(){
        System.out.println("Exibindo todos:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

    }

    public void exibirAlunosGraduacao(){
        System.out.println("Exibindo somente alunos de graduação:");
        for (Aluno aluno : alunos) {
            if(aluno instanceof AlunoGraduacao){
                System.out.println(aluno);
            }
        }
    }

    public void exibirAlunosAprovados() {
        for(Aluno aluno : alunos) {
            if(aluno.getCalcularMedia() >= 6) {
                System.out.println(aluno);

            }
        }

    }

    public void buscarAluno(Integer ra) {
        Boolean achou = false;
        for (Aluno aluno : alunos) {
            if (ra.equals(aluno.getRa())) {
                System.out.println(aluno);
                achou = true;
            }
        }
        if (!achou) {
            System.out.println("Não encontrado!");
        }
    }
    }

