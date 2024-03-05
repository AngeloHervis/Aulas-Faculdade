import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int opcao = 0;
        while (opcao != 9) {
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Mostrar os números Ímpares. ");
            System.out.println("2 - Mostrar os números Pares. ");
            System.out.println("9 - Encerrar ");

            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Números ímpares:");
                for (int num : numeros) {
                    if (num % 2 != 0) {
                        System.out.println(num);
                    }
                }
            } else if (opcao == 2) {
                System.out.println("Números pares:");
                for (int num : numeros) {
                    if (num % 2 == 0) {
                        System.out.println(num);
                    }
                }
            }
        }
        System.out.println("Sistema encerrado!!");
    }
}
