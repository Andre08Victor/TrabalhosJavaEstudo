import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    //Atributo
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavraSet.add(new String(palavra));
    }
    public void removerPalavra(String palavra){
        if (palavraSet.contains(palavra)){
            palavraSet.remove(palavra);
        }
    }
    public void verificarPalavra(String palavra){
       if (palavraSet.contains(palavra)) {
        System.out.println("A palavra " + palavra + " está no conjunto.");
       } else {
        System.out.println("A palavra " + palavra + " não está no conjunto.");
       }
    }
    public void exibirPalavras(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
       
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.removerPalavra("Palavra 2");
        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.verificarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.verificarPalavra("Palavra 2");

    }

}
