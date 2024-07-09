import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livroList;

    

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();//Criação do ArrayList
    }
    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livroList.add(new Livro(titulo, autor, anoDePublicacao));
    }
    public String pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro livro : livroList) {
            if (livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(livro);
            }
        }
        return "Livros do autor pesquisado: " + livrosPorAutor;
    }
    public String pesquisarPorIntervalosDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalos = new ArrayList<>();
        for (Livro livro : livroList) {
            if (livro.getAnoDePublicacao() > anoInicial && livro.getAnoDePublicacao() < anoFinal){
                livrosPorIntervalos.add(livro);
            }
        }
        return "Livro do intervalo pesquisado: " + livrosPorIntervalos;
    }
    public String pesquisarPorTitulo(String titulo){
        for (Livro livro : livroList) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                return "Livro pesquisado: " + livro;
            }
        }
        return "Não encontramos o livro pelo título desejado.";
    }

    public static void main(String[] args) {
        
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Historia da Redenção", "Ellen White", 1870);
        catalogo.adicionarLivro("Grande Conflito", "Ellen White", 1888);
        catalogo.adicionarLivro("Um minuto para sempre", "Odailson Fonseca", 2023);

        System.out.println(catalogo.pesquisarPorTitulo("Um minuto para sempre"));
        
    }

}
