import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercício Interface");

        Moto moto = new Moto("H2R", 2023, 2100);
        Carro carro = new Carro("Uno", 1999, 2);
        Barco barco = new Barco("Catamaran", "branco", "Veleiro");

        List<IVeiculo> lista = new ArrayList<>();

        lista.addAll(Arrays.asList(moto, carro, barco));

        for (IVeiculo v : lista) {
            System.out.println(v.ligar());
            System.out.println(v.acelerar());
            System.out.println(v.frear());
            System.out.println(v.desligar() + "\n");         
        }
        
    }
}
