package Aula10.ArcadeGame;

public class Objeto {
//    Attributes
    private int posx;
    private int posy;
    private char direcao;

//    Constructor
    public Objeto(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

//    Getters/Setters
    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    //    Methods
    public void irA(int x, int y, char direcao) {
        this.posx = x;
        this.posy = y;
        this.direcao = direcao;
        System.out.println("Posicao: X = " + x + "\nY = " + y + "\ndirecao = " + direcao);
    }
}
