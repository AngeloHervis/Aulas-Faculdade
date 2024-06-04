import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("lista 6 - Ex 1");

        Agenda agenda = new Agenda(new LinkedList<>());

        Contato c1 = new Contato("Pedro", "3216546897");
        Contato c2 = new Contato("João", "7987654654");
        Contato c3 = new Contato("Pedro", "3216546897");
        Contato c4 = new Contato("Nicolas", "7987654654");


        agenda.adicionarContato(c1);
        agenda.adicionarContato(c2);
        agenda.adicionarContato(c3);
        agenda.adicionarContato(c4);
        agenda.adicionarContato(new Contato("Nicolas", "987987978"));

        System.out.println(agenda);

        System.out.println(agenda.buscarContato("nicolas"));

        agenda.removerContato("nicolas");

        System.out.println(agenda);
    }
}
