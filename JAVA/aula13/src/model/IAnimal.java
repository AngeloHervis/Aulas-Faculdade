package model;

public interface IAnimal extends Comparable<IAnimal>{
    String TESTE = "Teste";

    String emitirSom();
    String mover(boolean movendo);
    String getNome();
    
    default String teste(){
        return TESTE;
    }
    @Override
    default int compareTo(IAnimal animal) {
        return this.getNome().compareTo(animal.getNome());
    }
    
}