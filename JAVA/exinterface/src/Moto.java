public class Moto implements IVeiculo {
    private String modelo;
    private int ano, cilindrada;
    
    public Moto(String modelo, int ano, int cilindrada) {
        this.modelo = modelo;
        this.ano = ano;
        this.cilindrada = cilindrada;
    }

    @Override
    public String acelerar() {
        return "Moto acelerando";
    }

    @Override
    public String desligar() {
        return "Moto desligada";
    }

    @Override
    public String frear() {
        return "Moto freando";
    }

    @Override
    public String ligar() {
        return "Moto ligada";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto [modelo=" + modelo + ", ano=" + ano + ", cilindrada=" + cilindrada + "]";
    }

    
}
