import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    
    //Atributo
    private Set<Contato> contatoSet;
    
    public AgendaDeContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome, telefone));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoTelefone){
        Contato contatoatualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoTelefone);
                contatoatualizado = c;
                break;
            }
        }
        return contatoatualizado;
    }

    public static void main(String[] args) {
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();

       agendaDeContatos.adicionarContato("Contato 1", 123456789);
       agendaDeContatos.adicionarContato("Contato 2", 987654321);
       agendaDeContatos.adicionarContato("Contato 3", 123987456);
       agendaDeContatos.exibirContato();
       System.out.println(agendaDeContatos.pesquisarPorNome("Contato 2"));
       System.out.println(agendaDeContatos.atualizarNumeroContato("Contato 1", 147852369));
    }
}
