import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite o seu nome: ");
            String nome = entrada.nextLine();
            System.out.println("Digite o seu ano de nascimento: ");
            int anoNascimento = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Digite o seu curso: ");
            String curso = entrada.nextLine();

            System.out.printf("O seu nome é %s, você nasceu em %d e o seu curso é o de %s", nome, anoNascimento, curso);
        }
    }
}
