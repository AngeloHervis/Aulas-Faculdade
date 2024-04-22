import animal.Animal;

public final class Gato extends Animal{
  
    public Gato(String nome, String som){
        super.setNome(nome);
        super.setSom(som);
        super.fome = true;
        super.dormindo = false;
    }

    public String ronronar(){
        return "Gato ronronando";
    }

    public String emitirSom(){
        return "Gato miando " + super.getSom();
    }

    @Override
    public String toString() {
        return "Gato [Nome: " + super.getNome() + " Som: " + super.getSom() + " Dormindo? " + super.isDormindo() + " fome? " + super.isFome();
    }
    

}
