package Aula05;

import java.util.Scanner;

public class UsuarioJogo {

//    Attributes
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    //    Class Constructor
    public UsuarioJogo(String nome, String nickname) {
//        Initializing class attributes
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 0;
    }

    //    Getters/Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //    Methods
    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void bonus(int valor) {
        this.pontuacao += valor;
    }

}
