public class Livro implements Comparable<Livro>{
    private String nome, autor, genero;
    private int qtde;
    
    public Livro(String nome, String autor, String genero, int qtde) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.qtde = qtde;
    }

    public boolean reduzirEstoque(){
        if (qtde > 0) {
            qtde--;
            return true;
        }
        return false;
    }
    public void aumentarEstoque(){

            qtde++;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "\nLivro [nome=" + nome + ", autor=" + autor + ", genero=" + genero + ", qtde=" + qtde + "]";
    }

    @Override
    public int compareTo(Livro o) {
        return nome.compareTo(o.getNome());
    }

    
}
