package Aula11.Printer;

import java.time.LocalDate;

public abstract class Impressora {
//    Atributtes
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;
    private double porcentagemTinta;

//    Constructor
    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis,
                      double porcentagemTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.porcentagemTinta = porcentagemTinta;
    }

//    Getters/Setters
    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public double getPorcentagemTinta() {
        return porcentagemTinta;
    }

    public void setPorcentagemTinta(double porcentagemTinta) {
        this.porcentagemTinta = porcentagemTinta;
    }

//    Methods
    public boolean temPapel() {
        if (this.folhasDisponiveis>0)
            return true;
        else
            return false;
    }

    public boolean precisaTinta() {
        if (this.porcentagemTinta==0)
            return true;
        else
            return false;
    }

    public abstract String imprimir();
}
