import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    public Biblioteca(String nome, List<Livro> livros) {
        this.nome = nome;
        this.livros = livros;
    }

    public List<Livro> emprestarLivros(List<Livro> livros){
        return livros.stream().filter(livro -> livro.reduzirEstoque())
            .map(livro -> new Livro(livro.getNome(), livro.getAutor(), livro.getGenero(), 1))
            .collect(Collectors.toList());
    }

    public void devolverLivros(List<Livro> livros){
        livros.forEach(livro -> this.livros.forEach(l -> {
         if(l.getNome().equals(livro.getNome())){
            l.aumentarEstoque();
         }}
        ));
    }

    public Livro buscarLivro(String titulo){
        return livros.stream().filter(l -> l.getNome().equals(titulo)).findFirst().orElse(null);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return "Biblioteca [nome=" + nome + ", livros=" + livros + "]";
    }

    
}
