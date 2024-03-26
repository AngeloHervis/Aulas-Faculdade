public class App {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 20, 50);
        Produto produto2 = new Produto("Calça", 50, 30);

        System.out.println("Status dos produtos antes das vendas:");
        produto1.exibirProduto();
        produto2.exibirProduto();

        System.out.println("\nRealizando vendas:");
        produto1.venderProduto(20);
        produto2.venderProduto(40);

        System.out.println("\nStatus dos produtos após as vendas:");
        produto1.exibirProduto();
        produto2.exibirProduto();
    }
}
