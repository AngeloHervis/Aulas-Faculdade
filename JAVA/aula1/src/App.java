import java.util.Scanner;

/**
 * @author    : Nome autor
 * @version   : 0.1
 * @deprecated: A classe vai deixar de existir na proxima versão
 * @see 
 */

public class App {
    public static void main(String[] args) throws Exception {
        // comentário de linha
        /* comentário de bloco
         * 
         * 
         */

        System.out.print("Hello, World! \n");
        System.out.println("texto 2");

        //Tipos Primitivos
        int ano = 2024;
        float numeroComVirgula = 10.5f;
        char letra = 'a';
        boolean aprovado = true;

        //Typecast
        float nota = (float) 5.5;
        float anoFloat = (float) ano;
        
        //WraperClass
        //String nome = "João";
        String nome = new String("João");
        Integer dataNascimento = 2000;

        //Float salario = 1412f;
        //Float salario = new Float(1412f); //Depreciado
        Float salario = Float.valueOf(1412f);

        //String anoString = Integer.toString(ano);

        String anoString = "O ano é " + ano;

        System.out.println(ano - 1);
        

        //Entrada de dados

        Scanner entrada = new Scanner(System.in);

        System.out.println("###############");
        System.out.println("Digite um número Inteiro");

        int numero1 = entrada.nextInt();

        System.out.println("Digite outro número");

        int numero2 = entrada.nextInt();

        System.out.println("O Resultado da soma é " + (numero1 + numero2));
        
        System.out.print("Digite um Float: ");
        float numeroFloat = entrada.nextFloat();

        System.out.println("###########");

        System.out.printf("O float Digitado é %,2f",numeroFloat);System.out.format("O Ano %-10d foi muito bom", ano);
        System.out.format("Meu nome é %s", nome);


        

    }
}
