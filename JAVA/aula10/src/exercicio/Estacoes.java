package exercicio;

public enum Estacoes {
    JANEIRO(1, "Verão", "Janeiro"),
    FEVEREIRO(2, "Verão", "Fevereiro"),
    MARCO(3, "Outono", "Março"),
    ABRIL(4, "Outono", "Abril"),
    MAIO(5, "Outono", "Maio"),
    JUNHO(6 , "Inverno", "Junho"),
    JULHO(7, "Inverno", "Julho"),
    AGOSTO(8, "Inverno", "Agosto"),
    SETEMBRO(9, "Primavera", "Setembro"),
    OUTUBRO(10, "Primavera", "Outubro"),
    NOVEMBRO(11, "Primavera", "Novembro"),
    DEZEMBRO(12, "Verão", "Dezembro");

    private int id;
    private String estacao, nome;
    
    private Estacoes(int id, String estacao, String nome) {
        this.id = id;
        this.estacao = estacao;
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEstacao() {
        return estacao;
    }
    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


}
