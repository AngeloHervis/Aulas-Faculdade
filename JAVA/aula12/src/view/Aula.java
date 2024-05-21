package view;

import java.util.Scanner;

import polimorfismo.Cachorro;
import polimorfismo.Gato;

public class Aula {
    public static void main(String[] args, Scanner in) {
        Cachorro cao = new Cachorro("Pluto", "grande", 80);
        Gato gato = new Gato("Felix", "Pequeno");

        System.out.println(cao);
        System.out.println(gato);

        System.out.println("Digite o seu nome");
        System.out.println("Seja bem vindo " + in.nextLine());

    }
}
