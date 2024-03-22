public class App {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jogador 1", 100, 10, 3);
        Jogador jogador2 = new Jogador("Jogador 2", 120, 12, 2);
        Jogador jogador3 = new Jogador("Jogador 3", 90, 15, 4);
        Jogador jogador4 = new Jogador("Jogador 4", 110, 8, 3);
        Jogador jogador5 = new Jogador("Jogador 5", 80, 20, 2);

        Jogador vencedor = Jogador.batalhar(jogador1, jogador2);
        System.out.println("O vencedor da batalha 1 é: " + vencedor.getNome());
        vencedor = Jogador.batalhar(vencedor, jogador3);
        System.out.println("O vencedor da batalha 2 é: " + vencedor.getNome());
        vencedor = Jogador.batalhar(vencedor, jogador4);
        System.out.println("O vencedor da batalha 3 é: " + vencedor.getNome());
        vencedor = Jogador.batalhar(vencedor, jogador5);
        System.out.println("O vencedor da batalha final é: " + vencedor.getNome());

        System.out.println("\nInformações dos jogadores após as batalhas:");
        jogador1.exibirInformacoes();
        jogador2.exibirInformacoes();
        jogador3.exibirInformacoes();
        jogador4.exibirInformacoes();
        jogador5.exibirInformacoes();
    }
}
