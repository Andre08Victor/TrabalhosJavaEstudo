import java.util.ArrayList;

public class SomaNumeros {
    
    private ArrayList<Integer> numerosInteirosList;
    
    
    public SomaNumeros() {
        this.numerosInteirosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numerosInteirosList.add(numero);
    }
    public String calcularSoma(){
        int soma = 0;
        for (int numero : numerosInteirosList) {
            soma += numero;
        }
        return "A soma dos números dentro da lista é igual a " + soma;
    }
    public String encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (int numero : numerosInteirosList) {
           if (numero > maiorNumero){
            maiorNumero = numero;
           }
        }
        return "O maior número da lista é " + maiorNumero;
    }
    public String encontrarMenorNumero(){
        int menorNumero = 999999999;
        for (int numero : numerosInteirosList) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return "O menor número da lista é " + menorNumero;
    }
    public void exibirNumeros(){
        for (int numero : numerosInteirosList) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(10);
        soma.adicionarNumero(5);
        soma.adicionarNumero(2);
        soma.adicionarNumero(16);
        soma.adicionarNumero(-2);
        soma.adicionarNumero(-99);
        System.out.println(soma.calcularSoma());
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.encontrarMenorNumero());
        soma.exibirNumeros();
    }

}
