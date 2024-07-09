import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProdutos {
    
    //Atributos
    private Set<Produto> produtoSet;


    
    public CadastroDeProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }
    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }

}
