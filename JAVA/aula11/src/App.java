import java.util.ArrayList;
import java.util.List;

import animal.Animal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("HERANÇA");

        Animal gato = new Gato("Felix", "Miua");

        Cachorro cao = new Cachorro("Snoopy", "Au au");
        cao.setNome("Snoopy");
        cao.setSom("Au au");
        cao.setFome(true);
        cao.setDormindo(false);

        System.out.println(gato);
        System.out.println(cao);

        //Animal animal = new Animal("Animal", "Nenhum");
        System.out.println("\nUSANDO LISTA\n");
        List<Animal> animais = new ArrayList<>();
        
        animais.add(cao);
        animais.add(gato);

        animais.forEach(System.out::println);

        System.out.println("\n USANDO O METODO emitirSom()\n");
        animais.forEach(a -> System.out.println(a.emitirSom()));

        
    }
}
