package CheckpointPokemon;

public class JogadorPrincipal extends Treinador{
    private int numeroDeinsignias;

    public JogadorPrincipal(String nome, char genero, Pokemon pokemonEscolhido, int numeroDeinsignias) {
        super(nome, genero, pokemonEscolhido);
        this.numeroDeinsignias = numeroDeinsignias;
    }

    public int getNumeroDeinsignias() {
        return numeroDeinsignias;
    }

    public void setNumeroDeinsignias(int numeroDeinsignias) {
        this.numeroDeinsignias = numeroDeinsignias;
    }
}