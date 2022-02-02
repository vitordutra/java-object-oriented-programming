package ListaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite o número de litros vendidos: ");
        double litros = entrada.nextDouble();

        System.out.println("Digite o tipo do combustivel vendido:  A-álcool, G-gasolina ");
        entrada.nextLine();
        String tipo = entrada.nextLine();

        System.out.println(tipo);
        double valor = 0;
        double valorfinal = 0;
        if (litros<= 20 && tipo.equals("A")){
            valor = (litros * 1.90);
            valorfinal = valor - (valor * (3.0/100));
        }else if (litros> 20 && tipo.equals("A")){
            valor = (litros * 1.90);
            valorfinal = valor - (valor * (5.0/100));
        }else if (litros<= 20 && tipo.equals("G")){
            valor = (litros * 2.50);
            valorfinal = valor - (valor * (4.0/100));
        }else if (litros> 20 && tipo.equals("G")){
            valor = (litros * 2.50);
            valorfinal = valor - (valor * (6.0/100));
        }

        System.out.println("Você irá pagar o valor de " + valorfinal + " reais!");
    }
}
