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

        // System.out.println("Aula de Estruturas Condicionais");
        int i = 0;
        // int j = 0;
        float soma = 0;
        float subtracao = 0;
        float multiplicacao = 0;
        float divisao = 0;

        // soma = a + b;
        // subtracao = b - a;
        // multiplicacao = a * b;
        // divisao = b / a;
        // restoDivisao = b % a;

        // System.out.println("Soma = " + soma);
        // System.out.println("Subtração = " + subtracao);
        // System.out.println("Multiplicação = " + multiplicacao);
        // System.out.println("Divisão = " + divisao);
        // System.out.println("Resto da Divisão = " + restoDivisao);

        // // Incrementos e Decrementos

        // System.out.println("Incremento após = " + a++);
        // System.out.println("Incremento antes = " + ++b);

        // System.out.println("Decremento após = " + a--);
        // System.out.println("Decremento antes = " + --b);

        // for (i = 1; i <= 4; i++) {
        // System.out.println("Digite a " + i + "° nota");
        // soma += entrada.nextFloat();
        // }
        // System.out.println("A média das notas foi: " + soma / 4);

        // Calculadora

        while (i != 9) {
            System.out.println("Bem-vindo a calculadora");
            System.out.println("Escolha a opção:");
            System.out.println("1 - Adição: ");
            System.out.println("2 - Subtração: ");
            System.out.println("3 - Multiplicação: ");
            System.out.println("4 - Divisão: ");
            System.out.println("9 - Sair: ");

            i = entrada.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Escolha o primeiro número: ");
                    float soma1 = entrada.nextFloat();
                    System.out.println("Escolha o segundo número: ");
                    float soma2 = entrada.nextFloat();
                    soma = soma1 + soma2;
                    System.out.println("A soma dos números deu: " + soma);
                    break;
                case 2:
                    System.out.println("Escolha o primeiro número: ");
                    float sub1 = entrada.nextFloat();
                    System.out.println("Escolha o segundo número: ");
                    float sub2 = entrada.nextFloat();
                    subtracao = sub1 - sub2;
                    System.out.println("A subtração dos números deu: " + subtracao);
                    break;
                case 3:
                    System.out.println("Escolha o primeiro número: ");
                    float mult1 = entrada.nextFloat();
                    System.out.println("Escolha o segundo número: ");
                    float mult2 = entrada.nextFloat();
                    multiplicacao = mult1 * mult2;
                    System.out.println("A multiplicação dos números deu: " + multiplicacao);
                    break;
                case 4:
                    System.out.println("Escolha o primeiro número: ");
                    float div1 = entrada.nextFloat();
                    System.out.println("Escolha o segundo número: ");
                    float div2 = entrada.nextFloat();
                    divisao = div1 / div2;
                    System.out.println("A divisão dos números deu: " + divisao);
                    break;

                default:
                    System.out.println("Opção Inválida! Tente novamente...");
                    break;
            }
        }
    }
}