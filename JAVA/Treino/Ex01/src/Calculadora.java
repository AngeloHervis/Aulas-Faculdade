import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        try{
        System.out.println("Calculadora Simples");
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operação desejada (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0.0;

        switch (operacao) {
            case '+':
                resultado = num1 +num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if(num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }
    
        System.out.println("Resultado:" + resultado);
        }
        finally{
        scanner.close();
    }
}
}