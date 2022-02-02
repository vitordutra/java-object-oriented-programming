package Aula15.ResolucaoPessoal;

import Aula15.ResolucaoPessoal.Capitao;
import Aula15.ResolucaoPessoal.Embarcacao;

public class Veleiro extends Embarcacao {
//    Attributes
    private int numMastros;

//    Constructor
    public Veleiro(double precoBase, double valorAdicional, int anoFabricacao, double comprimento, Capitao capitao, int numMastros) {
        super(precoBase, valorAdicional, anoFabricacao, comprimento, capitao);
        this.numMastros = numMastros;
    }

//    Getters/Setters
//    Methods
    public void avaliarTamanho(){
        System.out.println(this.numMastros > 4 ? "Veleiro grande": "Veleiro pequeno");
    }
}
