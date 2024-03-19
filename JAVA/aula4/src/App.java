public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Carro uno = new Carro();
        uno.modelo = "Uno";
        uno.marca = "Fiat";

        uno.andar();
        System.out.println("Marca: " + uno.marca);
        System.out.println("Modelo: " + uno.modelo);
        System.out.println("Andando: " + uno.andando);
        System.out.println("Ligado: " + uno.ligado);

        Carro palio = new Carro("Fiat", "Palio");
        palio.parar();
        System.out.println("Marca: " + palio.marca);
        System.out.println("Modelo: " + palio.modelo);
        System.out.println("Andando: " + palio.andando);
        System.out.println("Ligado: " + palio.ligado);
    }
}
