package Aula02.Mesa;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números: ");
        float numb1 = sc.nextFloat();
        float numb2 = sc.nextFloat();
        float numb3 = sc.nextFloat();
        float maior = Math.max(Math.max(numb1, numb2), numb3);
        System.out.println("O maior número é: " + maior);
    }
}
