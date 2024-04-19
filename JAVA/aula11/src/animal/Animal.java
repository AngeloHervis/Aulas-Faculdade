package animal;
public abstract class Animal{
    private String nome, som;
    protected boolean dormindo, fome;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
        this.dormindo = false;
        this.fome = true;
    }
    public Animal(){
        this.dormindo = false;
        this.fome = true;
    }

    public abstract String emitirSom();

    public void comer(){
        fome = false;
    }

    public void dormir(){
        dormindo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public boolean isDormindo() {
        return dormindo;
    }

    public void setDormindo(boolean dormindo) {
        this.dormindo = dormindo;
    }

    public boolean isFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }


}