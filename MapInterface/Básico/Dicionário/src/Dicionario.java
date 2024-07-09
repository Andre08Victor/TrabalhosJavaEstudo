import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        palavrasMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        }
    }
    public void exibirPalavras(){
        System.out.println(palavrasMap);
    }
    public String pesquisarPorPalavra(String palavra){
        String descricaoPorPalavra = null;
        if (!palavrasMap.isEmpty()) {
            descricaoPorPalavra = palavrasMap.get(palavra);
        }
        return descricaoPorPalavra;
    }
    
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Futebol", "Esporte");
        dicionario.adicionarPalavra("Moeda", "Dinheiro");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Moeda"));
        dicionario.removerPalavra("Moeda");
        dicionario.exibirPalavras();
    }

}
