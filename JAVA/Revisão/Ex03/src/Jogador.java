public class Jogador {
    // Atributos
    private String nome;
    private int pontuacao;
    private int numBatalhas;
    private int nivel;

    // Construtor
    public Jogador(String nome, int pontuacao, int numBatalhas, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.numBatalhas = numBatalhas;
        this.nivel = nivel;
    }

    // Método para atualizar a pontuação do jogador
    public void atualizarPontuacao(int novaPontuacao) {
        pontuacao = novaPontuacao;
    }

    // Método para subir de nível
    public void subirNivel() {
        nivel++;
    }

    // Método para exibir informações do jogador
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Número de batalhas: " + numBatalhas);
        System.out.println("Nível: " + nivel);
        System.out.println();
    }
    
    // Método para retornar o nome do jogador
    public String getNome() {
        return nome;
    }

    // Método para realizar uma batalha entre dois jogadores
    public static Jogador batalhar(Jogador jogador1, Jogador jogador2) {
        if (jogador1.nivel > jogador2.nivel) {
            jogador1.subirNivel();
            return jogador1;
        } else if (jogador2.nivel > jogador1.nivel) {
            jogador2.subirNivel();
            return jogador2;
        } else {
            if (jogador1.numBatalhas > jogador2.numBatalhas) {
                jogador1.subirNivel();
                return jogador1;
            } else {
                jogador2.subirNivel();
                return jogador2;
            }
        }
    }
}
