package Aula15.Embarcacoes;

import java.util.ArrayList;

public class Estaleiro {
    private String nome;
    private ArrayList<Embarcacao> embarcacoes = new ArrayList<>();

    public Estaleiro(String nome) {
        this.nome = nome;

    }

    public void adicionarEmbarcacao(Embarcacao e){
        this.embarcacoes.add(e);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Embarcacao> getEmbarcacoes() {
        return embarcacoes;
    }

    public void setEmbarcacaos(ArrayList<Embarcacao> embarcacaos) {
        this.embarcacoes = embarcacaos;
    }



}
