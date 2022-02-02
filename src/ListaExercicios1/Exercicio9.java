package ListaExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();
        int cont = -1;
        while (cont != 0){
            System.out.println("Digite as temperaturas ou 1000 para sair");
            int temp = entrada.nextInt();
            if (temp==1000){
                cont = 0;
            }else{
                lista.add(temp);
            }
        }
        int min = 2, max = 0, soma = 0;


        for (int i = 0; i< lista.size(); i++){
            if (lista.get(i)<=min){
                min = lista.get(i);
            }
            if ((lista.get(i)>=max)){
                max = lista.get(i);
            }
            soma += lista.get(i);
        }

        System.out.println("O menor número é " + min);
        System.out.println("O maior número é " + max);
        System.out.println("O média é " + (soma/lista.size()));
    }

}
