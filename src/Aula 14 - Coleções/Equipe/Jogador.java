package Aula14.Equipe;

public class Jogador implements Comparable<Jogador> {
//    Attributes
    private int numCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

//    Constructor
    public Jogador(int numCamisa, String nome, boolean lesionado, boolean titular) {
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

//    Getters/Setters
    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

//    Methods
    @Override
    public int compareTo(Jogador o) {
        if (o.numCamisa == this.numCamisa)
            return 0;
        else if (o.numCamisa < this.numCamisa)
            return 1;
        else
            return -1;
    }
}
