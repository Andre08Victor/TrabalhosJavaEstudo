import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributo
    private List<Item> itemList;
    //método construtor
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();//Criação do ArrayList
    }
    public void adicionarItem(String nome, double preco, int quantidade){ //Adicionando Item
        itemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){ //Removendo Item
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(item);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }
    public void exibtiItens(){
        for (Item item : itemList) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Arroz", 10, 2);
        carrinho.adicionarItem("Feijão", 2.00, 5);
        carrinho.adicionarItem("Farinha", 3.5, 4);
        carrinho.exibtiItens();
        carrinho.removerItem("Arroz");
        carrinho.exibtiItens();
    }
    
}