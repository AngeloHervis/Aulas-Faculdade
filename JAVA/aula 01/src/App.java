import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.print("Olá, Mundo!");

        int ano = 2024;
        float numeroComVirgula = 10.5f;
        char letra = 'a';
        boolean aprovado = true;

        // Typecast
        float nota = (float) 5.5;
        float anoFloat = (float) ano;

        // Wraperclass
        // String nome = "Angelo";
        String nome = new String("Angelo");
        Integer dataNascimento = 2005;

        // Float salario = 1412f;
        // Float salario = new Float(1412f); //Depreciado
        Float salario = Float.valueOf(1412f);

        String anoString = Integer.toString(ano);

        System.out.println(ano - 1);

        // Entrada de dados

        Scanner entrada = new Scanner(System.in);

        System.out.println("####################");
        System.out.println("Digite um número Inteiro: ");

        int numero1 = entrada.nextInt();

        System.out.println("Digite outro Número: ");

        int numero2 = entrada.nextInt();

        System.out.println("O resultado da soma é " + (numero1 + numero2));

        System.out.println("Digite um Float: ");
        Float numeroFloat = entrada.nextFloat();

        System.out.printf("O float digitado é %.1f", numeroFloat);
        System.out.printf("O ano %d foi muito bom", ano);

    }
}
