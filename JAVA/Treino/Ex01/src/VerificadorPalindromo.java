import java.util.Scanner;

public class VerificadorPalindromo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificador de palíndromos: ");
        System.out.println("Digite uma palavra para verificar se é um palíndromo");
        String palavra = scanner.nextLine();

        //Remover espaços em branco e pontuações que não precisamos
        palavra = palavra.replaceAll("^a-zA-Z^", "").toLowerCase();

        //Verificar se a palavra é um palíndromo
        boolean palindromo = true;
        for(int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - i - 1)) {
                palindromo = false;
                break;
            }
        }

            //Exibir o resultado
            if (palindromo) {
                System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");

            } else{
                System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
            }

            scanner.close();
        
    }
}
