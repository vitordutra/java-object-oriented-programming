package Aula23;

public class Curso extends Ofertas {
    private int horasMes;
    private int numMeses;
    private double precoHora;

    public Curso(String nome, String descricao, int horasMes, int numMeses, double precoHora) {
        super(nome, descricao);
        this.horasMes = horasMes;
        this.numMeses = numMeses;
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPreco() {
        return precoHora * horasMes * numMeses;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "horasMes=" + horasMes +
                ", numMeses=" + numMeses +
                ", precoHora=" + precoHora +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preço calculado='" + this.calcularPreco() + '\'' +

                '}';
    }
}
