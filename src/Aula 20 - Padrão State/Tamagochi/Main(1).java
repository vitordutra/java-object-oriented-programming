package Aula20.Tamagochi;

public class Main {
    public static void main(String[] args) {
        Tamagochi tamagochi = new Tamagochi();
//        Inicia com estado triste
        System.out.println(tamagochi.getEstado().getClass());
        tamagochi.carinho();
//        Muda para estado feliz
        System.out.println(tamagochi.getEstado().getClass());
    }
}
