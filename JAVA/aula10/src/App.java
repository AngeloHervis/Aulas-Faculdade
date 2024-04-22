import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import exercicio.Atributos;
import exercicio.Planetas;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercícios Collections");

        List<Livro> lista = new ArrayList<>();
        lista.add(new Livro("Livro 3", "Autor 3", "Terror", 5));
        lista.add(new Livro("Livro 4", "Autor 4", "Terror", 5));
        lista.add(new Livro("Livro 5", "Autor 5", "Terror", 5));
        lista.add(new Livro("Livro 1", "Autor 1", "Terror", 5));
        lista.add(new Livro("Livro 2", "Autor 2", "Terror", 5));

        Biblioteca biblioteca = new Biblioteca("Biblioteca", lista);

        System.out.println("///// BIBLIOTECA SEM ORDERNAR //////");
        System.out.println(biblioteca);
        
        Collections.sort(lista);
        
        System.out.println("///// BIBLIOTECA ORDENADA //////");
        System.out.println(biblioteca);

        Cliente cliente = new Cliente("Pedro", new ArrayList<Livro>());
        
        cliente.getLivros().add(biblioteca.buscarLivro("Livro 1"));
        cliente.getLivros().add(biblioteca.buscarLivro("Livro 3"));

        cliente.setLivros(biblioteca.emprestarLivros(cliente.getLivros()));

        System.out.println("/////// Biblioteca depois de Emprestar");
        System.out.println(biblioteca);
        System.out.println("/////// Cliente depois de Emprestar");
        System.out.println(cliente);


        biblioteca.devolverLivros(cliente.getLivros());
        cliente.setLivros(new ArrayList<>());

        System.out.println("/////// Biblioteca depois de Emprestar");
        System.out.println(biblioteca);
        System.out.println("/////// Cliente depois de Emprestar");
        System.out.println(cliente);


        System.out.println("//// Exercícios ENUM");

        Scanner in = new Scanner(System.in);

        System.out.println("Exercício 2 - Planetas");
        System.out.println("Digite o nome do Planeta");

        Planetas planeta = Planetas.valueOf(in.nextLine().toUpperCase().trim());
        System.out.println("O planeta " + planeta + " tem o raio " + planeta.getRaio() + " e a massa " + planeta.getMassa());

        System.out.println("Planetas Maiores");

        for (Planetas p : Planetas.values()) {
            if (p.getRaio() > planeta.getRaio()) {
                System.out.println(p);
            }
        }

        System.out.println("Planetas Menores");

        for (Planetas p : Planetas.values()) {
            if (p.getRaio() < planeta.getRaio()) {
                System.out.println(p);
            }
        }
        System.out.println("Planetas maiores Statico");

        System.out.println(Planetas.planetasMaiores(planeta));

        System.out.println("planetas maiores do que urano ");
        System.out.println(Planetas.planetasMaiores(Planetas.URANO));


        System.out.println(Atributos.nome);
        System.out.println(Atributos.pi);

        Atributos.nome = "teste";

        System.out.println(Atributos.nome);







    }
}
