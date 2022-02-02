package ListaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite o tamanho da área a ser pintada ");
        double area = entrada.nextDouble();

        double litros = area / 3;
        double latas = 0;

        if (area % 54 == 0){
            latas = area / 54;
        }else {
            latas = (area / 54) + 1;
        }

        System.out.println("Você precisará de " + (int)latas  +
                " latas de tintas. O valor necessário será de " + ((int)latas * 80) + " reais");
    }
}
