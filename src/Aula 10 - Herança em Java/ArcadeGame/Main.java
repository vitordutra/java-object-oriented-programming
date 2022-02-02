package Aula10.ArcadeGame;

public class Main {
    public static void main(String[] args) {
//        Nave
        Nave nave = new Nave(20,10,'N',30.2);
//        Status
        System.out.println(nave);
//        Direction
        nave.irA(4,37,'S');
//        Shows
        System.out.println(nave.equals(nave));

//        Enemy
        Nave naveInimiga = new Nave(25,6,'L',26.2);
        System.out.println(naveInimiga);
        System.out.println(nave.equals(naveInimiga));
//        Turn on
        naveInimiga.girar('N');
//        Quantify life
        naveInimiga.restaVida(2);
//        Status
        System.out.println(naveInimiga);

//        Asteroide
        Asteroide asteroide = new Asteroide(2,27,'O',20);
//        Status
        System.out.println(asteroide);
        System.out.println(asteroide.hashCode());
    }
}
