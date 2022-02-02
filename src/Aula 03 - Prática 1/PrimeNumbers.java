package Aula03;

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int n){
        if (n<=1) return false;
        for (int j = 2; j < n; j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EXERCICIO 1");
        /* Implemente um programa que nos permita exibir os primeiros
        "n" números primos pelo console, onde "n" é um valor numérico
        inserido pelo usuário. Por exemplo: Com n = 7, o que o programa
        deve retornar é "Os primeiros 7 números primos são: 2, 3, 5, 7,
        11, 13, 17". */
        System.out.println(("Input a value:"));
        int number = input.nextInt();
        int primes = 0;
        int value = 0;

        System.out.println("Showing the " + number + " first prime numbers:");

        while (primes < number) {
            if (isPrime(value)) {
                System.out.println(value);
                primes++;
            }
            value++;
        }
    }
}
