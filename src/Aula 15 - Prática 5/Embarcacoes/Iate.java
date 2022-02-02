package Aula15.Embarcacoes;

import java.text.NumberFormat;

public class Iate extends Embarcacao implements Comparable<Iate>{
    private int numCabines;

    public Iate(double precoBase, double valorAdicional, int anoFabricacao, double comprimento, Capitao capitao, int numCabines) {
        super(precoBase, valorAdicional, anoFabricacao, comprimento, capitao);
        this.numCabines = numCabines;
    }

    @Override
    public int compareTo(Iate o) {
        if (this.numCabines == o.numCabines){
            System.out.println("Os dois são igualmente luxuosos");
            return 0;
        } else if (this.numCabines < o.numCabines){
            System.out.println("O primeiro iate é menos luxuoso");
            return -1;
        } else{
            System.out.println("O primeiro iate é mais luxuoso");
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Iate{" +
                "capitao=" + capitao +
                ", numCabines=" + numCabines +
                '}';
    }
}
