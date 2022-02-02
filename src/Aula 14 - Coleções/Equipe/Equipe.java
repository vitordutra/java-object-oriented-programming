package Aula14.Equipe;

import java.util.ArrayList;
import java.util.Collections;

public class Equipe {
//    Attributes
    private String nome;
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();

//    Constructor
    public Equipe(String nome) {
        this.nome = nome;
    }

    //    Methods
    public void addJogador(Jogador jogador) {
        listaJogadores.add(jogador);
    };

    public void mostrarJogadoresTitulares() {
        Collections.sort(listaJogadores);
        for (Jogador jogador: listaJogadores) {
            if (jogador.isTitular()) {
                System.out.println("Nome: " + jogador.getNome() +
                        " Número da camisa: " + jogador.getNumCamisa());
            }
        }
    };

    public int getQuantidadeJogadoresLesionados() {
        int contador = 0;
        for (Jogador jogador: listaJogadores) {
            if (jogador.isLesionado() && jogador.isTitular())
                contador++;
        }
        return contador;
    };
}
