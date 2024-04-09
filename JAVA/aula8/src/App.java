import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 8 - Collections");
        System.out.println("////// LISTA EM JAVA /////");

        // é melhor pra buscas e acesso aleatório
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("PHP");
        arrayList.add("C#");

        // é melhor pra inserção e remoção
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("PHP");
        linkedList.add("C#");
        linkedList.add("C#");

        System.out.println(arrayList);
        System.out.println(linkedList);

        linkedList.replaceAll(elemento -> elemento.equals("C#")? "C++": elemento);
        linkedList.removeIf(e -> e.equals("C++"));
        linkedList.addAll(Arrays.asList("Python", "HTML", "CSS"));

        linkedList.forEach(System.out::println);

        int[] i = {1};

        arrayList.forEach(e ->  System.out.println("Valor: " + (i[0]++) + " " + e));

        for (int j : i) {
            System.out.println("O valor atual é " + j);
        }


        Aluno aluno = new Aluno("Pedro", new ArrayList<>());

        String[] nomeMateria = {"PHP", "Java", "C++", "Python", "HTML", "CSS"};

        for (String mat : nomeMateria) {
            aluno.getMateria().add(new Materia(mat));
        }
        
        System.out.println(aluno);

        Materia html = new Materia("HTML");
        Materia novaMat = new Materia(null);
        for (Materia mat : aluno.getMateria()) {
            if (mat.getNome().equals("HTML")) {
                novaMat = mat; // mesmo objeto
                html.setNome(mat.getNome()); // objetos diferentes
            }
        }

        //aluno.getMateria().remove(novaMat);
        novaMat.setNome("HTML5");
        
        System.out.println(aluno);

        System.out.println("Tamanho do vetor: " + aluno.getMateria().size());

        System.out.println("Verificando se o objeto está no vetor " + aluno.getMateria().contains(html));

        aluno.getMateria().set(3, html);
        System.out.println(aluno);

        System.out.println("\n ////////// STREAM EM JAVA ///////////\n");


        Materia php = aluno.getMateria()
            .stream()
            .filter(e -> e.getNome().equals("PHP8"))
            .findFirst()
            .orElse(null);

        System.out.println("Materia PHP " + php);

        //php.setNome("PHP8");

        List<Materia> listaNova = aluno.getMateria()
            .stream()
            .map(m -> new Materia(m.getNome() + " !"))
            .collect(Collectors.toList());

        System.out.println(listaNova);

        aluno.getMateria().add(new Materia("PHP"));

        listaNova = aluno.getMateria()
            .stream()
            .filter(m -> m.getNome().equals("PHP"))
            .collect(Collectors.toList());

        System.out.println(listaNova);

        System.out.println(
            aluno.getMateria()
            .stream()
            .map(Materia::getNome)
            .reduce("Materias: ",(novaString, stringIteradora) -> novaString + stringIteradora + ", ")
        );
        
        System.out.println("\n ///////// SET EM JAVA //////// \n");
        //Set não permite itens duplicados
        //HashSet Não mantém a ordem
        //LinkedHashSet mantém a ordem de inserção
        //TreeSet
        Set<String> set = new TreeSet<>();
        set.add("Java");
        set.add("PHP");
        set.add("Python");
        set.add("C++");
        set.add("C++");
        set.add("C++");
        set.add("C++");
        set.add("C#");
        set.add("CSS");

        System.out.println(set);

        Collections.sort(aluno.getMateria());
        System.out.println(aluno.getMateria());

        Set<Materia> setMateria = new TreeSet<>();
        setMateria.addAll(aluno.getMateria());
        System.out.println(setMateria);
    }  
}
