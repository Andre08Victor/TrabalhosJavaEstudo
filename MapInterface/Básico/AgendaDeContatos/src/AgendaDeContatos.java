import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
    
    private Map<String, Integer> agendaDeContatosMap;

    public AgendaDeContatos() {
        this.agendaDeContatosMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaDeContatosMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if (!agendaDeContatosMap.isEmpty()) {
            agendaDeContatosMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaDeContatosMap);
    }  
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaDeContatosMap.isEmpty()) {
             numeroPorNome = agendaDeContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();

        agendaDeContatos.adicionarContato("Andre", 123456);
        agendaDeContatos.adicionarContato("Mãe", 326548);
        agendaDeContatos.exibirContato();
        
        System.out.println(agendaDeContatos.pesquisarPorNome("Mãe"));

    }
}
