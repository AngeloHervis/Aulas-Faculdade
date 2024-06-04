public class Carro implements IVeiculo{
    private String modelo;
    private int ano, numPortas;
    
    public Carro(String modelo, int ano, int numPortas) {
        this.modelo = modelo;
        this.ano = ano;
        this.numPortas = numPortas;
    }

    @Override
    public String acelerar() {
        return "O carro está acelerando.";
    }

    @Override
    public String desligar() {
        return "O carro está desligado";
    }

    @Override
    public String frear() {
        return "O carro está freando";
    }



    @Override
    public String ligar() {
        return "O carro está ligado";
    }



    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", ano=" + ano + ", numPortas=" + numPortas + "]";
    }

    
}
