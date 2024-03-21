public class Gato {
    // Atributos
    private String nome;
    private int idade;
    private String cor;

    //Construtor
    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    //Método para o gato miar
    public void miar() {
        System.out.println(nome + " está miando!");
    }


    //Método para obter o nome do gato
    public String getNome() {
        return nome;
    }

    //método para definir o nome do gato
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método para obter a idade do gato
    public int getIdade() {
        return idade;
    }

    //Método para definir a idade do gato
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Método para obter a cir do gato
    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void main (String[] args) {
    // Criando um objeto gato
    Gato meuGato = new Gato("Bolinha", 3, "branco");

    //chamando o método de miar do gato
    meuGato.miar();
    }
}
