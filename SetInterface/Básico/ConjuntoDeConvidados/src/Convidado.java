public class Convidado {
    
    //Atributos
    private String nome;
    private int codigoConvite;

    
    public Convidado() {
    }
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
    public int getCodigoConvite() {
        return codigoConvite;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Convidado: " + nome + ", Código do Convite: " + codigoConvite;
    }


}
