package ListaExercicios2.Exercicio2CarroCorrida;

import java.text.DecimalFormat;

public class CarroCorrida {
//    Decimal Format
    DecimalFormat df = new DecimalFormat("0.00");

//    Attributes
    private int numeroCarro;
    private String piloto;
    private String equipe;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

//    Constructor
    public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipe = equipe;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

//    Getters/Setters
    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

//    Methods
    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        if (isLigado() && this.velocidadeAtual != 0)
            System.out.println("Não é possível desligar o veículo!");
        else {
            setLigado(false);
            System.out.println("Veículo desligado");
        }
    }

    public void parar() {
        setVelocidadeAtual(0);
        System.out.println("FREOU!!! O carro está PARADO!");
    }
    
    public float acelerar(float valor) {
        if (!this.ligado) {
            setVelocidadeAtual(0);
            System.out.println("ATENÇÃO: O motor está desligado!");
        } else if (this.velocidadeAtual + valor > this.velocidadeMaxima) {
            setVelocidadeAtual(this.velocidadeMaxima);
            System.out.println("VOCÊ SERÁ MULTADO! Sua velocidade foi limitada a "
                    + df.format(this.velocidadeMaxima) + " km/h");
        } else {
            this.velocidadeAtual += valor;
            System.out.println("ACELEROU!!! Velocidade atual: " + df.format(this.velocidadeAtual) + "km/h");
        }
        return this.velocidadeAtual;
    }

    public float frear(float porcentagem) {
        if (!this.ligado) {
            setVelocidadeAtual(0);
            System.out.println("ATENÇÃO: O motor está desligado! O carro já está parado!");
        } else if (this.velocidadeAtual == 0){
            System.out.println("ATENÇÃO: O carro já está parado!");
        } else {
            this.velocidadeAtual *= (1-porcentagem/100);
            if (this.velocidadeAtual <= 0) {
                parar();
            } else
                System.out.println("FREOU!!! Velocidade atual: " + df.format(this.velocidadeAtual) + "km/h");
        }
        return this.velocidadeAtual;
    }

//    Overriding

    @Override
    public String toString() {
        return "Carro de Corrida: " +
                "\nNúmero do veículo: " + this.numeroCarro +
                "\nPiloto: " + this.piloto +
                "\nEquipe = " + this.equipe +
                "\nVelocidade máxima que o veículo pode atingir: " + df.format(this.velocidadeMaxima) + " km/h" +
                "\nVelocidade atual do veículo: " + df.format(this.velocidadeMaxima) + " km/h";
    }
}
