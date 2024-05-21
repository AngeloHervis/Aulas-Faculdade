import java.util.Scanner;

import util.Util;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 12");
        Scanner in = new Scanner(System.in);

        view.Aula.main(args, in);
        view.Teste.main(args, in);

        System.out.println("Digite um numero");
        int cont = in.nextInt();

        System.out.println(Util.contagemRegressiva(cont));
        System.out.println("Programa Encerrado");

    }
}
