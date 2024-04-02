import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LocalDate data = LocalDate.parse("2000-12-05");

        Materia materia = new Materia("Matematica");
        Materia mat2 = new Materia("Fisica");

        Aluno aluno = new Aluno("Pedro", "Rua XV", "nenhum", "8000-000", data, materia);

        List<Materia> materias = new ArrayList<>();
        materias.add(new Materia(materia.getNome()));
        materias.add(mat2);

        materia.setNome("Geografia");

        System.out.println(aluno);
        System.out.println("\n" + materias);


    }
}
