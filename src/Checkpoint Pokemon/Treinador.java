package CheckpointPokemon;

public abstract class Treinador {
    private String nome;
    private char genero;
    private Pokemon pokemonEscolhido;

    public Treinador(String nome, char genero, Pokemon pokemonEscolhido) {
        this.nome = nome;
        this.genero = genero;
        this.pokemonEscolhido = pokemonEscolhido;
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Implementa Tipo de Movimento. Adiciona classe MOVE
    public void lutar(Move move){
        System.out.println("Usou " + move.getNome());
    }

    // implementando método para escolher o pokemon. Adicionar classe Pokemon
    public void trocarPokemon(Pokemon pokemon){
        this.pokemonEscolhido = pokemon;
        System.out.println("Pokémon ativo: " + pokemonEscolhido.getNome());
    }

    // Fugir da Batalha
    public void fugir(){
        System.out.println(this.getNome() + " fugiu da batalha...");
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", genero=" + genero +
                ", pokemonEscolhido=" + pokemonEscolhido.getApelido();
    }
}