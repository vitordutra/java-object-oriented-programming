package Aula22.Trem;

public class Circulo extends Figura{
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.pow(this.raio, 2) * Math.PI;
    }
}
