import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    
    private List<Pessoas> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoas(nome, idade, altura));
    }
    public List<Pessoas> ordenarPorIdade(){
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoas> ordenarPorAltura(){
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura);
        return pessoasPorAltura;
    }
    
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }

}
