package Aula03;

import java.util.Locale;
import java.util.Scanner;

public class Cachorros {
    public static void quantosPacotes(float quantidade){
        Scanner entrada = new Scanner(System.in);
        float kilo = 0.0f;
        int pacote = 0;
        while(kilo < quantidade){
            System.out.println("Digite o peso do pacote: ");
            String entradaAux = entrada.nextLine();
            float aux = Float.parseFloat(entradaAux);
            kilo += aux;
            pacote++;
        }
        System.out.println("Você vai precisar de " + pacote + " pacote(s)");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // setar o locale
        System.out.println("Digite o nome do cachorrinho: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a quantidade de ração: ");
        float quantidade = entrada.nextFloat();
        quantosPacotes(quantidade);
    }
}
