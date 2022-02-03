package CheckpointPokemon;

import java.util.ArrayList;

public abstract class Pokemon {
    private int numeroPokedex;
    private String nome;
    private String apelido;
    private int LV;
    private int ATK;
    private int DEF;
    private int SPD;
    private Elemento tipo;
    private ArrayList<Move> ataquesConhecidos = new ArrayList<>();

    public Pokemon(int numeroPokedex, String nome, String apelido, int LV, int ATK, int DEF, int SPD, Elemento tipo) {
        this.numeroPokedex = numeroPokedex;
        this.nome = nome;
        this.apelido = apelido;
        this.LV = LV;
        this.ATK = ATK;
        this.DEF = DEF;
        this.SPD = SPD;
        this.tipo = tipo;
    }

    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getLV() {
        return LV;
    }

    public void setLV(int LV) {
        this.LV = LV;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public int getSPD() {
        return SPD;
    }

    public void setSPD(int SPD) {
        this.SPD = SPD;
    }

    public Elemento getTipo() {
        return tipo;
    }

    public void setTipo(Elemento tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Move> getAtaquesConhecidos() {
        return ataquesConhecidos;
    }

    public void setAtaquesConhecidos(ArrayList<Move> ataquesConhecidos) {
        this.ataquesConhecidos = ataquesConhecidos;
    }

    public void addMove(Move move) {
        this.ataquesConhecidos.add(move);
    }

    public void removerMove(Move move) {
        this.ataquesConhecidos.remove(move);
    }

    public void listarMoves() {
        System.out.println("Lista de Ataques: ");
        for (Move ataque:ataquesConhecidos) {
            System.out.println(ataque.getNome());
        }
    }

    public void subirNivel() {
        if (this.LV <= 100) {
            this.LV++;
            this.ATK += 5;
            this.DEF += 5;
            this.SPD += 5;
            System.out.println("Parabéns! O nível de " + this.apelido + " subiu para " + this.LV);
        } else {
            System.out.println("Seu Pokémon está no nível máximo!!");
        }
    }

    @Override
    public String toString() {
        return
                "numeroPokedex=" + numeroPokedex +
                ", nome='" + nome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", LV=" + LV +
                ", ATK=" + ATK +
                ", DEF=" + DEF +
                ", SPD=" + SPD +
                ", tipo=" + tipo.getNome();
    }
}
