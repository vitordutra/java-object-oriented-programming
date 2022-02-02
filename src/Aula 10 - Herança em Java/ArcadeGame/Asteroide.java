package Aula10.ArcadeGame;

import java.util.Objects;

public class Asteroide extends Objeto {
    //    Attributes
    private int danos;

    //    Constructor
    public Asteroide(int x, int y, char direcao, int danos) {
        super(x, y, direcao);
        this.danos = danos;
    }

//    Getters/Setters
    public int getDanos() {
        return danos;
    }

//    Methods
    @Override
    public String toString() {
        return "Asteroide:" +
            "\nPosicao x = " + super.getPosx() +
            "\nPosicao y = " + super.getPosy() +
            "\nDirecao = " + super.getDirecao() +
            "\ndanos = " + this.danos + '\n';
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asteroide asteroide = (Asteroide) o;
        return danos == asteroide.danos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(danos);
    }
}