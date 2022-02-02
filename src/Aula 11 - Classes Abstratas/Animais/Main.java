package Aula11.Animais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cachorro");
        System.out.println("Nome: ");
        String cao = scan.next();
        System.out.println("Idade: ");
        int ageCao = scan.nextInt();
        Cachorro cachorro = new Cachorro(cao, ageCao);
        cachorro.correr();
        cachorro.emitirSom();

        System.out.println("\nCavalo");
        System.out.println("Nome: ");
        String horse = scan.next();
        System.out.println("Idade: ");
        int ageHorse = scan.nextInt();
        Cavalo cavalo = new Cavalo(horse, ageHorse);
        cavalo.correr();
        cavalo.emitirSom();

        System.out.println("\nPreguiça");
        System.out.println("Nome: ");
        String pregui = scan.next();
        System.out.println("Idade: ");
        int agePregui = scan.nextInt();
        Preguica preguica = new Preguica(pregui, agePregui);
        preguica.emitirSom();
        preguica.subirArvore();

        scan.close();
    }
}
