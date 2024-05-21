package polimorfismo;

import util.Util;

public class Cachorro extends Animal {
    private int idade;

    public Cachorro(String nome, String porte, int idade) {
        super(nome, porte);
        this.idade = idade;
    }

    @Override
    public String emitirSom(){
        Util.contagemRegressiva(idade);
        return "Cachorro Latindo";
    }

    protected int emitirSom(int i){
        return i;
    }

    @Override
    public String correr(){
        return "Cachorro Correndo";
    }

    public String correr(float velocidade){
        return "Correndo a " + velocidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cachorro ["+ super.toString() +"idade=" + idade + "]";
    }
    
}
