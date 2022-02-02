package Aula19.Armazem;

public class Bola extends Produto {
    private double raio;

    public Bola(double peso, double raio) {
        super(peso);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularEspaco() {
        return (Math.PI)*(Math.pow(this.raio, 2));
    }
}
