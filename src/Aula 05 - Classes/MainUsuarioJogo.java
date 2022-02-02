package Aula05;

public class MainUsuarioJogo {
    public static void main(String[] args) {

//        User Create
        UsuarioJogo usuarioJogo = new UsuarioJogo("Alex", "Spider");
        UsuarioJogo usuarioJogo1 = new UsuarioJogo("Diego", "Imortal");

//        Showing players
        System.out.println("Jogador 1:\n" + usuarioJogo.getNome());
        System.out.println(usuarioJogo.getNickname() + "\n");
        System.out.println("Jogador 2:\n" + usuarioJogo1.getNome());
        System.out.println(usuarioJogo1.getNickname() + "\n");

//        Setting Pointing
        usuarioJogo.aumentarPontuacao(100);
        usuarioJogo1.aumentarPontuacao(200);

//        Setting Levels
        usuarioJogo.subirNivel();
        usuarioJogo1.subirNivel();
        usuarioJogo1.subirNivel();

//        Giving bonus for users
        usuarioJogo.bonus(200);
        usuarioJogo1.bonus(1000);

//        Checking recent points
        System.out.println("A pontuação do " + usuarioJogo.getNome() + " é de: " + usuarioJogo.getPontuacao());
        System.out.println("A pontuação do " + usuarioJogo1.getNome() + " é de: " + usuarioJogo1.getPontuacao());

//        Checking levels
        System.out.println("\nO nível do "+ usuarioJogo.getNickname() + " é: " + usuarioJogo.getNivel());
        System.out.println("O nível do "+ usuarioJogo1.getNickname() + " é: " + usuarioJogo1.getNivel());

    }
}
