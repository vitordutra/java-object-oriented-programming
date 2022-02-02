package Aula06;

import java.time.LocalDate;

public class PetAdopt {
//    Attributes
    private String nome;
    private String raca;
    private double anoNascimento;
    private double peso;
    private boolean temChip;
    private boolean estaFerido;
    private boolean aptoAdocao;
    private double idade;

//    Class Constructor
    public PetAdopt(String nome, String raca, double anoNascimento, double peso, boolean temChip,
                    boolean estaFerido) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.temChip = temChip;
        this.estaFerido = estaFerido;
        idade = (LocalDate.now().getYear() - anoNascimento);
        aptoAdocao = !estaFerido && peso > 5;
    }

    //    Getters/Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(double anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTemChip() {
        return temChip;
    }

    public void setTemChip(boolean temChip) {
        this.temChip = temChip;
    }

    public boolean isEstaFerido() {
        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {
        this.estaFerido = estaFerido;
    }

    public boolean isAptoAdocao() {
        return aptoAdocao;
    }

    public void setAptoAdocao(boolean aptoAdocao) {
        this.aptoAdocao = aptoAdocao;
    }

    //    Methods
    @Override
    public String toString() {
        return "Cachorro { " +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", peso=" + peso +
                ", anoNascimento=" + anoNascimento +
                ", possuiChip=" + temChip +
                ", estaFerido=" + estaFerido +
                ", aptoParaAdocao=" + aptoAdocao +
                ", idade=" + idade +
                " }";
    }
}
