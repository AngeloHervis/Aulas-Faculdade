import java.util.ArrayList;
import java.util.List;

import util.Log;
import util.Salvar;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Gravando Txt");

        Textos textos = new Textos(new ArrayList<String>());
        
        textos.add("Aluno 1");
        textos.add("Aluno 2");
        textos.add("Aluno 3");
        textos.add("Aluno 4");

        try {
            Log.salvar(textos.getTextos(), "teste3");
            System.out.println("Arquivo Gravado com Sucesso!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Lendo arquivo");

        try {
            List<String> novosTextos = Log.ler("teste3");
            System.out.println(novosTextos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n Tentando salvar o Objeto \n");

        try {
            Salvar.salvar(textos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n\n Textos Novos");
        
        try {
            Textos textos2 = (Textos) Salvar.ler();
            textos2.add("Aluno 9");
            textos2.getTextos().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n\n Textos Antigos");

        textos.getTextos().forEach(System.out::println);
    }
}
