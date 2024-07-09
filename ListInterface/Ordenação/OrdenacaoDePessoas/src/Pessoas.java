import java.util.Comparator;

public class Pessoas implements Comparable<Pessoas> {
    
    private String nome;
    private int idade;
    private double altura;
    
    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    @Override
    public String toString() {
        return "Pessoas [nome= " + nome + ", idade= " + idade + ", altura= " + altura + "]";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoas p) {
        // TODO Auto-generated method stub
        return Integer.compare(idade, p.getIdade());
    }
}

class ComparatorPorAltura implements Comparator<Pessoas> {

    @Override
    public int compare(Pessoas p1, Pessoas p2) {
        // TODO Auto-generated method stub
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}