package Aula15.Embarcacoes;

import java.text.NumberFormat;

public abstract class Embarcacao {
    private double precoBase;
    private double valorAdicional;
    private int anoFabricacao;
    private double comprimento;
    protected Capitao capitao;

    public Embarcacao(double precoBase, double valorAdicional, int anoFabricacao, double comprimento, Capitao capitao) {
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacao = anoFabricacao;
        this.comprimento = comprimento;
        this.capitao = capitao;
    }

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

    public void calcularAluguel(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        if(this.anoFabricacao > 2020){
            String numFormatado = nf.format(this.precoBase +  this.valorAdicional);
            System.out.println(" O valor do aluguel é  " + numFormatado);
        } else {
            System.out.println(" O valor do aluguel é  " + nf.format(this.precoBase));
        }
    }

    /*@Override
    public String toString() {
        return "Embarcacao{" +
                "precoBase=" + precoBase +
                ", valorAdicional=" + valorAdicional +
                ", anoFabricacao=" + anoFabricacao +
                ", comprimento=" + comprimento +
                ", capitao=" + capitao +
                '}';
    }*/
}
