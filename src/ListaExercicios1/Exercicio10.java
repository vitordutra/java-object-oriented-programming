package ListaExercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Integer[] numeros = {0,1,2,3,4,5,6,7,8,9,10};

        int cont = -1;

        int nota = entrada.nextInt();
        boolean contido = false;
        while (cont!=0){
            for (int i = 0; i<numeros.length; i++){
                if (nota== numeros[i]){
                    contido = true;
                }
            }
            if (contido){
                cont = 0;
            }else{
                System.out.println("Digite um valor válido!");
                nota = entrada.nextInt();
            }

        }
    }
}
