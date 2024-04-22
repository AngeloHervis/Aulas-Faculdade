import java.util.*;
import view.Pessoa;
import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        view.Pessoa p1 = new Pessoa("Pedro");
        Teste t1 = new Teste("Pedro");

        //p1.nome = "José";
        t1.nome = "José";


        System.out.println("///////// ENUM ////////");

        System.out.println(Cidade.CURITIBA);

        Cidade cidade = Cidade.CAMPO_LARGO;
        System.out.println(cidade.getNome());

        System.out.println("Digite sua cidade");
        //Cidade novaCidade = Cidade.valueOf(scanner.nextLine().trim().replace(" ", "_").toUpperCase());

        //System.out.println(novaCidade);

        DiaDaSemana dia = DiaDaSemana.QUINTA;

        System.out.println("O dia " + dia + "é útil? " + dia.isEhUtil());
String texto = "segunda-feira ";
        /*dia = DiaDaSemana.valueOf(texto.trim().toUpperCase().replace("-FEIRA", "").replace(" FEIRA",""));

        System.out.println(dia);*/

        dia  = DiaDaSemana.buscarDia(texto);

        System.out.println(dia);
    }
}
