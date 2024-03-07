public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        float vetor[] = {1.5f,3.6f,5.7f};
        float soma = fzrSoma(vetor);
        System.out.println("A soma dos vetores é"+soma);
    }
    public static float fzrSoma(float vetor[]){
        float soma = 0.0f;
        for(float num : vetor){
        soma += num;
        }
        return soma;
    }
}
