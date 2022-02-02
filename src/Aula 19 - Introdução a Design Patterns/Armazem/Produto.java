package Aula19.Armazem;

public abstract class Produto {
    private double peso;

    public Produto(double peso) {
        this.peso = peso;
    }

    public abstract double calcularEspaco();

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
