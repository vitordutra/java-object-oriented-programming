package ListaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        nome = nome.toUpperCase(Locale.ROOT);
        for (int i = nome.length() -1 ; i>=0; i--){
            System.out.print(nome.charAt(i));
        }
    }
}
