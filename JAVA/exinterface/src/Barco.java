public class Barco implements IVeiculo {
    private String modelo, cor, tipo;

    public Barco(String modelo, String cor, String tipo) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
    }

    @Override
    public String acelerar() {
        return "O Barco está acelerando.";
    }

    @Override
    public String desligar() {
        return "O Barco está desligado";
    }

    @Override
    public String frear() {
        return "O Barco está freando";
    }

    @Override
    public String ligar() {
        return "O Barco está ligado";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Barco [modelo=" + modelo + ", cor=" + cor + ", tipo=" + tipo + "]";
    }

}
