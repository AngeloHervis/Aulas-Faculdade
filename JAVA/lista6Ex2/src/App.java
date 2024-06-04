import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lista 9 - Ex 2");

        //Produto prod = new Produto(1, "Pó de Café", 9.6f);

        //prod.nome = "Café";
        //System.out.println(prod);

        CadastroProduto havan = new CadastroProduto(new ArrayList<Produto>());
        Produto p1 = new Produto("Produto1", 10f);
        Produto p2 = new Produto("Produto2", 20f);
        Produto p3 = new Produto("Produto3", 30f);
        Produto p4 = new Produto("Produto4", 40f);
        Produto p5 = new Produto("Produto5", 40f);
        
        p5.setCod(2);
        havan.adicionarProduto(p1);
        havan.adicionarProduto(p2);
        havan.adicionarProduto(p3);
        havan.adicionarProduto(p4);
        havan.adicionarProduto(p5);

        System.out.println(havan);
    }
}
