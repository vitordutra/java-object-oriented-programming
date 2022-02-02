package Aula15.ResolucaoPessoal;

public class Iate extends Embarcacao implements Comparable<Iate>{
//    Attributes
    private int numCabines;

//    Constructor
    public Iate(double precoBase, double valorAdicional, int anoFabricacao, double comprimento, Capitao capitao, int numCabines) {
        super(precoBase, valorAdicional, anoFabricacao, comprimento, capitao);
        this.numCabines = numCabines;
    }

//    Getters/Setters

//    Methods
    @Override
    public int compareTo(Iate o) {
        if (this.numCabines == o.numCabines)
            return 0;
        else if (this.numCabines > o.numCabines)
            return 1;
        else
            return -1;
    }
}
