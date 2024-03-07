public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int numero = 5;
        int fatorial = calcFatorial(numero);
        System.out.println("O fatorial de "+ numero + " é: " + fatorial);
    }
    public static int calcFatorial(int numero){
        int resultado = 1;
        for (int i = 2; i <= numero; i++){
            resultado *= i;
        } 
        return resultado;
    }
}