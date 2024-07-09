import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagemPalavras.getOrDefault(palavra, 0) + contagem);
    }

    public void removerPalavra(String palavra) {
        contagemPalavras.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println("Contagem de palavras:");
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            System.out.printf("Palavra: %s, Contagem: %d%n", entry.getKey(), entry.getValue());
        }
    }

    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente() {
        Map.Entry<String, Integer> palavraMaisFrequente = null;
        int maxContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavras.entrySet()) {
            if (entry.getValue() > maxContagem) {
                maxContagem = entry.getValue();
                palavraMaisFrequente = entry;
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("exemplo", 1);
        contagem.adicionarPalavra("teste", 2);
        contagem.adicionarPalavra("exemplo", 1);
        contagem.adicionarPalavra("java", 3);
        contagem.adicionarPalavra("exemplo", 1);

        contagem.exibirContagemPalavras();

        Map.Entry<String, Integer> palavraMaisFrequente = contagem.encontrarPalavraMaisFrequente();
        if (palavraMaisFrequente != null) {
            System.out.printf("Palavra mais frequente: %s, Contagem: %d%n", palavraMaisFrequente.getKey(), palavraMaisFrequente.getValue());
        } else {
            System.out.println("Nenhuma palavra encontrada.");
        }

        contagem.removerPalavra("teste");
        contagem.exibirContagemPalavras();
    }
}

