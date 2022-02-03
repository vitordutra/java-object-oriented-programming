package CheckpointPokemon;

public class LiderDeGinasio extends Treinador {
    private Elemento especialidadePokemon;
    private String cidade;
    private int insigniaLider = 1;

    public LiderDeGinasio(String nome, char genero, Pokemon pokemonEscolhido, Elemento especialidadePokemon, String cidade) {
        super(nome, genero, pokemonEscolhido);
        this.especialidadePokemon = especialidadePokemon;
        this.cidade = cidade;
    }

    public void darInsignia(JogadorPrincipal jogadorPrincipal) {
        if (this.insigniaLider > 0) {
            jogadorPrincipal.setNumeroDeinsignias(jogadorPrincipal.getNumeroDeinsignias() + 1);
            this.insigniaLider -= 1;
        } else{
            System.out.println("O Líder não tem mais insignias!");
        }
    }

    // getters and setters

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getInsigniaLider() {
        return insigniaLider;
    }

    public void setInsigniaLider(int insigniaLider) {
        this.insigniaLider = insigniaLider;
    }
}