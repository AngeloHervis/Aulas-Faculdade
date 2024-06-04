import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public Contato buscarContato(String nomeContato){
        for (Contato contato : contatos) {
            if (contato.getNome().toLowerCase().equals(nomeContato.toLowerCase())) {
                return contato;
            }
        }
        return null;
    }

    public void adicionarContato(Contato contato){
        if(buscarContato(contato.getNome()) == null) contatos.add(contato);
    }

    public void removerContato(String nomeContato){
        Contato cont = buscarContato(nomeContato);
        if(cont != null) contatos.remove(cont);
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Agenda [contatos=" + contatos + "]";
    }

    
}
