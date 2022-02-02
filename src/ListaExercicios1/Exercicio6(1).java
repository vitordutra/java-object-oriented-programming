package ListaExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<Integer>();
        int cont = -1;
        while (cont != 0){
            System.out.println("Digite as idades ou 0 para sair");
            int idade = entrada.nextInt();
            if (idade==0){
                cont = 0;
            }else{
                lista.add(idade);
            }
        }

        double soma = 0;
        for (int i = 0; i < lista.size(); i++){
            soma += lista.get(i);
        }
        double media = soma/ lista.size();

        if (media > 0 && media <= 25){
            System.out.println("Jovem!");
        }else if (media > 25 && media <= 60){
            System.out.println("Adulta!!");
        }else{
            System.out.println("Idosa!!");
        }

        System.out.println(media);

    }
}
