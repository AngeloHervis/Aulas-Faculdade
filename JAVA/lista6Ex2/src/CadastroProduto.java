import java.util.List;

public class CadastroProduto {
    private List<Produto> produtos;

    public CadastroProduto(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto){
        produto.setCod(criarCodigo());
        if (buscarProdutoPorNome(produto.getNome()) == null) {
            produtos.add(produto);
        }

    }
    public Produto buscarProdutoPorCod(int cod){
        return produtos.stream().filter(p -> p.getCod() == cod).findFirst().orElse(null);
    }

    public Produto buscarProdutoPorNome(String nome){
        return produtos.stream().filter(p -> p.getNome().equals(nome)).findFirst().orElse(null);
    }

    private int criarCodigo(){
        int res = 0;
        for (Produto p : produtos) {
            if (res <= p.getCod()) {
                res = p.getCod();
            }
        }        
        return ++res;
    }

    public void removerProduto(int cod){
        produtos.remove(buscarProdutoPorCod(cod));
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "CadastroProduto [produtos=" + produtos + "]";
    }

    
}
