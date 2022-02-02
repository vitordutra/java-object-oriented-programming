package ListaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite o peso dos peixes: ");
        double peso = entrada.nextDouble();
        double excesso = 0;
        double multa = 0;
        if (peso> 50){
            excesso = peso - 50;
            multa = excesso * 4.0;
            System.out.println("Você ultrapassou o limite estabelecido, você deverá pagar a multa de " + multa);
        }else{
            System.out.println("Você pescou " + peso + " kilo de peixes.");
        }



    }
}
