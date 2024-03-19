import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * next() - Serve pra receber uma palavra
         * nextLine() - Serve pra receber um texto
         * nextInt() - Serve pra receber um inteiro
         * nextLong() - Serve para receber um long
         * nextFloat() - Serve pra receber um float
         * nextBoolean() - Serve pra receber um booleano
         */

        Scanner entrada = new Scanner(System.in);
        int a = 5;
        int b = 10;
        int soma, subtracao, multiplicacao, restoDivisao, dataNasc, idade;
        float divisao;
        String texto;

        System.out.println("Aula de Estruturas Condicionais");

        // Realizando calculos
        soma = a + b;
        subtracao = b - a;
        multiplicacao = a * b;
        divisao = b / a;
        restoDivisao = b % a;

        // Exibindo resultado de calculos
        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Resto da Divisão = " + restoDivisao);

        // Incrementos e Decrementos

        System.out.println("Incremento após = " + a++);
        System.out.println("Incremento antes = " + ++b);

        System.out.println("Decremento após = " + a--);
        System.out.println("Decremento antes = " + --b);

        // Estruturas de Controle Condicionais
        // ! = - diferente
        if (b != 10) {
            System.out.println("B é igual a 10");
        } else if (a == 5) {
            System.out.println("A é igual a 5");
        } else {
            System.out.println("Nenhum dos casos");
        }

        switch (a) {
            case 10:
                System.out.println("A igual a " + 10);
                break;
            case 5:
                System.out.println("A igual a " + 5);
                break;
            case 2:
                System.out.println("A igual a " + 2);
                break;
            default:
                System.out.println("Nenhum dos casos");
                break;
        }

        System.out.println("Digite seu ano de nascimento");
        dataNasc = entrada.nextInt();
        idade = 2024 - dataNasc;

        // if(idade >= 18) {
        // System.out.println("Você é maior de 18 anos");
        // } else {
        // System.out.println("Você é menor de 18 anos");
        // }

        // (Condicional)? Bloco Verdadeiro : Bloco Flase;
        // System.out.println("Você é " + ((idade >= 18)? "maior de 18 anos" : "menor e
        // 8 anos"));

        texto = (idade >= 18) ? "Você é maior de 18 anos" : "Você é menor de 18 anos";

        System.out.println(texto);

        System.out.println("#############");
        // Laços de Repetição

        int c = 5;
        while (c <= 10) {
            System.out.println("A é igual c " + (++c));
        }

        do{
            System.out.println("C é igual a " + --c);
        }while(c > 5);


        for(int cont = 0; cont < 10; cont++){
            System.out.println("Cont = " + cont);
        }


        int vetor[] = {5,7,4,9,3,1};

        System.out.println("Primeira posição é " + vetor[0]);

        for(int i=0; i < vetor.length; i++ ){
            System.out.println("Vetor posição " + i + " é igual a " + vetor[i]);
        }
        System.out.println("##########");

        for(int v: vetor){
            System.out.println("O valor é " + v);
        }


    }
}
