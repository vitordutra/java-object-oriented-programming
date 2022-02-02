package Aula02.Mesa;

import java.util.Scanner;

public class NumberPrimo {
    public static void ehPrimo(int num) {
        boolean divisivel = false;
        if (num > 0) {
            for (int j = 2; j < num; j++) {
                if (num % j == 0) divisivel = true;
            }
        } else if (num < 0) {
            for (int j = -2; j > num; j--) {
                if (num % j == 0) divisivel = true;
            }
        }
        if (divisivel || num == 1 || num == -1)
            System.out.println("O número " + num + " NÃO É primo!");
        else
            System.out.println("O número " + num + " é primo!");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        ehPrimo(numero);
    }
}
