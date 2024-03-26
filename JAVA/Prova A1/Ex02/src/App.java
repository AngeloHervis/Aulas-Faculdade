public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ângelo", 95396, "Gerente da Microsoft");
        funcionario.exibirFuncionario();
        funcionario.setSalario(800); //voltou a ser estagiário
        System.out.println("\nApós a alteração do salário:");
        funcionario.exibirFuncionario();
    }
}
