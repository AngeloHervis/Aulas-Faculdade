public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int vetor[] = {1,2,3,4,5,6,7,8,9,10,1000};
        int maior = encMaior(vetor);
        System.out.println("O maior número do vetor é: "+ maior);
    }
        public static int encMaior(int vetor[]){
        int maior = vetor[0];

        for(int nume : vetor){
            if (nume > maior ){
            maior = nume;
            }
        }
        return maior;
        }
}
    