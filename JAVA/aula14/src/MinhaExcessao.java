public class MinhaExcessao extends Exception {
    public MinhaExcessao(String mensagem){
        super("Minha Excessão: " + mensagem);
    }
}
