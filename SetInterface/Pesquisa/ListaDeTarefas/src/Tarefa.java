public class Tarefa {
    
    //Atributos
    private String descricao;
    private boolean conclusao;
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean isConclusao() {
        return conclusao;
    }
    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }
    public Tarefa() {
    }
    public Tarefa(String descricao, boolean conclusao) {
        this.descricao = descricao;
        this.conclusao = conclusao;
    }
    @Override
    public String toString() {
        return "Tarefa [Descricao = " + descricao + ", Conclusao = " + conclusao + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + (conclusao ? 1231 : 1237);
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
        Tarefa other = (Tarefa) obj;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (conclusao != other.conclusao)
            return false;
        return true;
    }
    
    

}
