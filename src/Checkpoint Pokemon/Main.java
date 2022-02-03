package CheckpointPokemon;

public class Main {
    public static void main(String[] args) {
        // Elementos
        Elemento fogo = new Elemento("Fogo");
        Elemento grama = new Elemento("Grama");
        Elemento agua = new Elemento("Água");
        Elemento normal = new Elemento("Normal");

        // Moves
        Move arranhar = new Move("Arranhar", 20, normal);
        Move bafoDePimenta = new Move("Bafo de Pimenta", 35, fogo);

        // Pokémon
        Charmander chacha = new Charmander(4, "Charmander", "Chacha", 1, 10, 10, 10, fogo);
        Squirtle tortuguita = new Squirtle(7, "Squirtle", "Tortuguita", 5, 17, 20, 5, agua);
        Bulbasaur sauron = new Bulbasaur(1, "Bulbasaur", "Sauron", 5, 17, 20, 5, grama);

        // Adicionando Moves
        chacha.addMove(arranhar);
        chacha.addMove(bafoDePimenta);

        chacha.listarMoves();

        // Subindo de Nível
        chacha.subirNivel();
        chacha.subirNivel();
        chacha.subirNivel();

        System.out.println(chacha);

        /*---------------------------------------------------------------------------------------------------------*/

        JogadorPrincipal yanaMendes = new JogadorPrincipal("Yana", 'F', chacha, 5);
        System.out.println(yanaMendes);

        LiderDeGinasio misty = new LiderDeGinasio("Misty", 'F', tortuguita, agua, "Cerulean");
        System.out.println(misty);

        // Testando os métodos dos Treinadores
        yanaMendes.fugir();
        yanaMendes.lutar(arranhar);
        yanaMendes.trocarPokemon(sauron);
        System.out.println("Número de Insígnias: " + yanaMendes.getNumeroDeinsignias());

        //Vamos dizer que Misty deu uma Insígnia para a Yana
        misty.darInsignia(yanaMendes);
        System.out.println("Número de Insígnias: " + yanaMendes.getNumeroDeinsignias());
    }
}
