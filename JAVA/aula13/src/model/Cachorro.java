package model;

public class Cachorro implements IAnimal {
    private String nome, voz;
    private int idade;
    public Cachorro(String nome, String voz, int idade) {
        this.nome = nome;
        this.voz = voz;
        this.idade = idade;
    }

    @Override
    public String emitirSom() {
        return "Cachorro Latindo";
    }

    @Override
    public String mover(boolean movendo) {
        return movendo ? "Cachorro Movendo" : "Cachorro Parado";
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
        return "\nCachorro [nome=" + nome + ", voz=" + voz + ", idade=" + idade + "]";
    }

   /* @Override
    public int compareTo(Cachorro dog) {
        return this.nome.compareTo(dog.getNome());
    }*/

    
    
}
