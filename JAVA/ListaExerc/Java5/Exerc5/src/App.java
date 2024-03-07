public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String nome = "Antonio";
        String sobrenome = "Neto";
        String ddd = "(41)";
        String telefone  = "99200-8176";
        Dados(nome,sobrenome,ddd,telefone);
    }
    public static void Dados(String nome, String sobrenome, String ddd, String telefone){
        System.out.println("Nome: "+nome);
        System.out.println("sobrenome: "+sobrenome);
        System.out.println("ddd: "+ddd);
        System.out.println("telefone: "+telefone);
        
    }
}
