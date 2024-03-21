import java.time.LocalDate;
import java.time.Period;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPubli;

    public Livro(String titulo, String autor, int anoPubli) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = anoPubli;
    }

    // exibir as informações do livro
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPubli);
        System.out.println("Dados do autor: ");
        exibirDadosAutor();
        System.out.println("Há quanto tempo foi lançado: " + calcularLivroTempo() + " anos");
    }

    // exibir os dados do autor
    private void exibirDadosAutor() {
        System.out.println("Nome do autor: " + autor);
    }

    // calcular há quanto tempo o livro foi lançado
    private int calcularLivroTempo() {
        LocalDate hoje = LocalDate.now();
        LocalDate DataPubli = LocalDate.of(anoPubli, 9, 11); // Assumindo que o livro foi publicado no dia 11 de
                                                             // setembro
        Period periodo = Period.between(DataPubli, hoje);
        return periodo.getYears();
    }
}