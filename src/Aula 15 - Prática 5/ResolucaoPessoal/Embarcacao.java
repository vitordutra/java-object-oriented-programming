package Aula15.ResolucaoPessoal;

import Aula15.ResolucaoPessoal.Capitao;

import java.text.NumberFormat;

public abstract class Embarcacao {
//    Attributes
    private double precoBase;
    private double valorAdicional;
    private int anoFabricacao;
    private double comprimento;
    private Capitao capitao;

//    Constructor
    public Embarcacao(double precoBase, double valorAdicional, int anoFabricacao, double comprimento, Capitao capitao) {
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacao = anoFabricacao;
        this.comprimento = comprimento;
        this.capitao = capitao;
    }

//    Getters/Setters
    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public Capitao getCapitao() {
        return capitao;
    }

    public void setCapitao(Capitao capitao) {
        this.capitao = capitao;
    }

//    Methods
    public void calcularAluguel() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        if (this.anoFabricacao > 2020)
            System.out.println("O aluguel é de " + nf.format(this.precoBase + this.valorAdicional));
        else
            System.out.println("O aluguel é de " + nf.format(this.precoBase));
}
}
