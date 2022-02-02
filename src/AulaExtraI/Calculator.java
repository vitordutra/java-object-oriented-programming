package AulaExtraI;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = 0;
        double num1, num2, result;
        num1 = num2 = result = 0;

        do{
            System.out.println("Insira a operação desejada:\n1-Soma\n2-Subtração\n3-Multiplicação" +
                    "\n4-Divisão\n0-Sair");
            x = entrada.nextInt();
            if (x == 0)
                break;
            else {
                System.out.println("Digite o primeiro número: ");
                num1 = entrada.nextDouble();
                System.out.println("Digite o segundo número: ");
                num2 = entrada.nextDouble();
            };
            switch (x) {
                case 1:
                    result = Double.sum(num1,num2);
                    System.out.println("Soma: " + result);
                    break;
                case 2:
                    result = num1-num2;
                    System.out.println("Subtração: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Multiplicação: " + result);
                    break;
                case 4:
                    result = num1 / num2;
                    System.out.println("Divisão: " + result);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (x != 0);
        entrada.close();
    }
}
