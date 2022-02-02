package ListaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Seu peso ideka é: " + ((72.7*altura) - 58));

    }
}
