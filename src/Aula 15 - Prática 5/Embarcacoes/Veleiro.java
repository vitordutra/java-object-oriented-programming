package Aula15.Embarcacoes;

public class Veleiro extends Embarcacao{
    private int numMastros;

    public Veleiro(double precoBase, double valorAdicional, int anoFabricacao, double comprimento, Capitao capitao, int numMastros) {
        super(precoBase, valorAdicional, anoFabricacao, comprimento, capitao);
        this.numMastros = numMastros;
    }

    public void avaliarTamanho(){

        System.out.println(this.numMastros>4 ? ("Veleiro grande.") : ("Veleiro pequeno"));
    }

    @Override
    public String toString() {
        return "Veleiro{" +
                "capitao=" + capitao +
                ", numMastros=" + numMastros +
                '}';
    }
}
