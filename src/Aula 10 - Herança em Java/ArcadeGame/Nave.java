package Aula10.ArcadeGame;

import java.util.Objects;

public class Nave extends Objeto {
//    Attributes
    private double velocidade;
    private int vida;

//    Constructor
    public Nave(int x, int y, char direcao, double velocidade) {
        super(x, y, direcao);
        this.velocidade = velocidade;
        this.vida = 10;
    }

//    Methods
    public void girar(char direcao){
        super.setDirecao(direcao);
    }

    public void restaVida(int valor) {
        if (valor <= this.vida)
            this.vida -= valor;
    }

//    Overriding
    @Override
    public int hashCode() {
        return Objects.hash(velocidade, vida);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Nave nave = (Nave) obj;
        return Double.compare(nave.velocidade, velocidade) == 0 && vida == nave.vida;
    }

    @Override
    public String toString() {
        return "Nave: " +
                "\nPosicao x = " + super.getPosx() +
                "\nPosicao y = " + super.getPosy() +
                "\nDirecao = " + super.getDirecao() +
                "\nvelocidade = " + velocidade +
                "\nvida = " + vida + '\n';
    }
}
