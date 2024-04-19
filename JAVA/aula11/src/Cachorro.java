import animal.Animal;

public class Cachorro extends Animal {
    

    public Cachorro(String nome, String som){
        super(nome, som);
    }

    public String uivar(){
        return "Cachorro Uivando";
    }

    public String emitirSom(){
        return "Cachorro latindo" + super.getSom();
    }
    @Override
    public String toString() {
        return "Cachorro [Nome: " + super.getNome() + " Som: " + super.getSom() + " Dormindo? " + super.isDormindo() + " fome? " + super.isFome();
    }

}
