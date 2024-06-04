public class Produto {
    private int cod;
    private String nome;
    private float preco;
    
    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public int getCod() {
        return cod;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Produto [cod=" + cod + ", nome=" + nome + ", preco=" + preco + "]";
    }

    
}
