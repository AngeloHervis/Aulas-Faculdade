package model;

public enum DiaDaSemana {
    SEGUNDA(true, "Segunda-feira"),
    TERCA(true, "Terça-feira"),
    QUARTA(true, "Quarta-feira"),
    QUINTA(true, "Quinta-feira"),
    SEXTA(true, "Sexta-feira"),
    SABADO(false, "Sábado"),
    DOMINGO(false, "Domingo");

    private boolean ehUtil;
    private String dia;

    private DiaDaSemana(boolean ehUtil, String dia) {
        this.ehUtil = ehUtil;
        this.dia = dia;
    }

    public static DiaDaSemana buscarDia(String dia){
        return DiaDaSemana.valueOf(dia.trim().toUpperCase().replace("-FEIRA", "").replace(" FEIRA",""));

    }

    public boolean isEhUtil() {
        return ehUtil;
    }

    public void setEhUtil(boolean ehUtil) {
        this.ehUtil = ehUtil;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    @Override
    public String toString(){
        return dia;
    }
}
