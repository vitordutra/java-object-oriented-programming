package ListaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int cod = -1, codTempAM = 0, codTempAMax = 0, codTempPM = 0, codTempPMax = 0;
        double altura = 0, peso = 0;
        double minA = 2, maxA = 0, somaA = 0;
        double minP = 2, maxP = 0, somaP = 0;
        int cont = 0, iterador  = -1;

        while (iterador != 0){
            System.out.println("Digite o codigo ou 0 para sair");
            cod = entrada.nextInt();
            if (cod == 0){
                iterador = 0;
            }else {
                altura = entrada.nextDouble();
                peso = entrada.nextDouble();
                if (altura <= minA) {
                    minA = altura;
                    codTempAM = cod;

                }
                if (altura >= maxA) {
                    maxA = altura;
                    codTempAMax = cod;
                }
                if (peso >= maxP) {
                    maxP = peso;
                    codTempPMax = cod;
                }
                if (peso <= minP) {
                    minP = peso;
                    codTempPM = cod;
                }
                somaA += altura;
                somaP += peso;
                cont++;
            }
        }

        System.out.println("O menor peso é " + minP +  " codigo: " + codTempPM);
        System.out.println("O maior peso é " + maxP + " codigo: " + codTempPMax);
        System.out.println("O média dos pesos é " + (somaP/cont));

        System.out.println("A menor altura é " + minA +  " codigo: " + codTempAM);
        System.out.println("A maior altura é " + maxA + " codigo: " + codTempAMax);
        System.out.println("O média das alturas é " + (somaA/cont));
    }


}
