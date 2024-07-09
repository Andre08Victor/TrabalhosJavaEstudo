import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {
    
    //Atributo
    private Set<Tarefa> tarefaSet;

    public ListaDeTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public Set<Tarefa> getTarefaSet() {
        return tarefaSet;
    }
    
    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }
    public void removerTarefa(String descricao){
        Set<Tarefa> tarefasParaRemover = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
                break;
            }
        }
        tarefaSet.removeAll(tarefasParaRemover);
    }
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    public void contarTarefas(){
        System.out.println(tarefaSet.size());
    }
    public Set obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isConclusao()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }
    public Set obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.isConclusao()) {
                
            } else {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
       for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConclusao(true);
            }
       }
    }
    public void marcarTarefaPendente(String descricao){
        for (Tarefa tarefa : tarefaSet) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setConclusao(false);
            }
        }
    }
    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        listaDeTarefas.adicionarTarefa("Tarefa 1");
        listaDeTarefas.adicionarTarefa("Tarefa 2");
        listaDeTarefas.adicionarTarefa("Tarefa 3");
        listaDeTarefas.adicionarTarefa("Tarefa 4");
        //listaDeTarefas.exibirTarefas();
        listaDeTarefas.removerTarefa("Tarefa 3");
        //listaDeTarefas.exibirTarefas();
        listaDeTarefas.marcarTarefaConcluida("Tarefa 2");
        listaDeTarefas.exibirTarefas();
        //System.out.println(listaDeTarefas.obterTarefasConcluidas());
        //System.out.println(listaDeTarefas.obterTarefasPendentes());
        listaDeTarefas.marcarTarefaPendente("Tarefa 2");
        listaDeTarefas.exibirTarefas();
        listaDeTarefas.limparListaTarefas();
        listaDeTarefas.exibirTarefas();
    }
}
