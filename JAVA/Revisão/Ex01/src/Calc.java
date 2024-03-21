import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Calculadora!! \n");
            for (int i = 0; i != 9; i++) {
                System.out.println("Digite o primeiro número: ");
                double num1 = entrada.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = entrada.nextDouble();

                System.out.println("Escolha a operação!");
                System.out.println(
                        "1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - Potenciação \n 6 - Fatoração");
                int operacao = entrada.nextInt();

                double resultado = 0.0;

                switch (operacao) {
                    case 1: {
                        resultado = num1 + num2;
                        System.out.println("O resultado da sua soma foi de " + resultado);
                        break;
                    }
                    case 2: {
                        resultado = num1 - num2;
                        System.out.println("O resultado da sua subtração foi de " + resultado);
                        break;
                    }
                    case 3: {
                        resultado = num1 * num2;
                        System.out.println("O resultado da sua multiplicação foi de " + resultado);
                        break;
                    }
                    case 4: {
                        resultado = num1 / num2;
                        System.out.println("O resultado da sua divisão foi de " + resultado);
                        break;
                    }
                    case 5: {
                        resultado = Math.pow(num1 , num2);
                        System.out.println("O resultado da sua potenciação foi de " + resultado);
                        break;
                    }
                    case 6: {
                        double fatoracaoNum1 = 1;
                        double fatoracaoNum2 = 1;
                        for (int j = 1; j <= num1; j++) {
                            fatoracaoNum1 *= j;
                        }
                        for (int j = 1; j <= num2; j++) {
                            fatoracaoNum2 *= j;
                        }
                        System.out.println("A fatoração do primeiro número é " + fatoracaoNum1);
                        System.out.println("A fatoração do segundo número é " + fatoracaoNum2);
                        break;
                    }
                }
            }
        } finally {
            entrada.close();
        }
    }
}
