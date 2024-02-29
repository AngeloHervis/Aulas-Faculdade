import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * next() - Serve pra receber uma Palavra
         * nextLine() - Serve pra receber um Texto
         * nextInt() - Serve pra receber um Inteiro
         * nextLong() - Serve pra receber um long
         * nextFloat() - Serve pra receber um Float
         * nextBoolean() - Serve pra receber um Booleano
         */

         Scanner entrada = new Scanner(System.in);

        System.out.println("Aula de Estruturas Condicionais");

        soma = a + b;
        subtracao = b - a;
        multiplicacao = a * b;
        divisao = b / a;
        restoDivisao = b % a;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multipliocação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Resto da Divisão = " + restoDivisao);

        // Incrementos e Decrementos

        System.out.println("Incremento após = " + a++);
        System.out.println("Incremento antes = " + ++b);

        System.out.println("Decremento após = " + a--);
        System.out.println("Decremento antes = " + --b);

        
    } 
}
