package ListaExercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        System.out.println("Responda 1 p SIM e 0 para NÃO ");

        System.out.println("Telefonou para a vítima?");
        int resposta = entrada.nextInt();
        if (resposta == 1){
            cont++;
        }
        System.out.println("Esteve no local do crime?");
        resposta = entrada.nextInt();
        if (resposta == 1){
            cont++;
        }
        System.out.println("Mora perto da vítima?");
        resposta = entrada.nextInt();
        if (resposta == 1){
            cont++;
        }
        System.out.println("Devia para a vítima?");
        resposta = entrada.nextInt();
        if (resposta == 1){
            cont++;
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = entrada.nextInt();
        if (resposta == 1){
            cont++;
        }

        if (cont < 2){
            System.out.println("Inocente!");
        }else if (cont == 2){
            System.out.println("Suspeita!");
        } else if (cont >=3 && cont <=4){
            System.out.println("Cumplice!");
        }else{
            System.out.println("Assassino!");
        }
    }
}
