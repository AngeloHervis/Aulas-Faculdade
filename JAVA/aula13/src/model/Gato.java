package model;

public class Gato implements IAnimal{
   private String nome, voz;
   private int idade;

public Gato(String nome, String voz, int idade) {
    this.nome = nome;
    this.voz = voz;
    this.idade = idade;
}

@Override
public String emitirSom() {
    return "Gato Miando";
}

@Override
public String mover(boolean movendo) {
    return movendo ? "Gato Movendo" : "Gato Parado";
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getVoz() {
    return voz;
}
public void setVoz(String voz) {
    this.voz = voz;
}
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
@Override
public String toString() {
    return "\nGato [nome=" + nome + ", voz=" + voz + ", idade=" + idade + "]";
}

/*@Override
public int compareTo(Gato cat) {
    return this.nome.compareTo(cat.getNome());
};*/

    
}
