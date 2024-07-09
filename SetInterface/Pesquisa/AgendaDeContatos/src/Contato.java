public class Contato {
    
    //Atributos
    private String nome;
    private int telefone;

    
    public Contato() {
    }
    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nome: " + nome + ". Telefone: " + telefone;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
    
    
    

}
