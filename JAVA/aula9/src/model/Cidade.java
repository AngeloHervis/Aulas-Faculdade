package model;

public enum Cidade {
    CURITIBA(41,"Curitiba"),
    CAMPO_LARGO(41, "Campo Largo"),
    PONTA_GROSSA(42, "Ponta Grossa");

    private int ddd;
    private String nome;
    
    private Cidade(int ddd, String nome) {
        this.ddd = ddd;
        this.nome = nome;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return nome;
    }
}
