import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorDeAlunos {
    
    //Atributos
    private Set<Aluno> alunoSet;

    public GerenciadorDeAlunos() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, long matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }
    public void removerAluno(long matricula){
        for (Aluno aluno : alunoSet) {
            if (aluno.getMatricula() == matricula) {
                alunoSet.remove(aluno);
            }
        }
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>();
        return alunosPorNome;
    }
    
    
    
}
