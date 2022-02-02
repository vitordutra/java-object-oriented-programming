package ListaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horas = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Digite o valor da hora: ");
        double valor = entrada.nextDouble();

        double salario = horas * valor;

        System.out.println("O seu salário é de: " + salario);


    }
}
