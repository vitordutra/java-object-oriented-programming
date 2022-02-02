package Aula10.Academy;

public class Associado {
//    Attributes
    private String numAssociado;
    private String nome;
    private double valorMensal;
    private String atividade;

//    Constructor
    public Associado(String numAssociado, String nome, double valorMensal, String atividade) {
        this.numAssociado = numAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.atividade = atividade;
    }

//    Methods
    public double custoMensal() {
        return this.valorMensal;
    }

//    toString
    @Override
    public String toString() {
        return "Associado \n" +
                "numAssociado = " + numAssociado + '\n' +
                "nome = " + nome + '\n' +
                "valorMensal = " + valorMensal + '\n' +
                "atividade = " + atividade + '\n';
    }
}
