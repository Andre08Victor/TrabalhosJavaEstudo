import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public Double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }

            }

        }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;  
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
                
            }

        }
        return produtoMaisBarato;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorQuantidadeValorTotalNoEstoque = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if ((p.getQuantidade() * p.getPreco() > maiorQuantidadeValorTotalNoEstoque)) {
                    produtoMaiorQuantidadeValorTotalNoEstoque = p;
                }
                
            }
            
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Melado de Cana", 6, 14.00);
        estoqueProdutos.adicionarProduto(2, "Mel 330g", 9, 26.00);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
    }
}
