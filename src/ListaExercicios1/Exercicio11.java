package ListaExercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número");

        int numero = entrada.nextInt();
        System.out.println("Tabuada de " + numero);

        for (int i = 1; i<=10; i++){
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
