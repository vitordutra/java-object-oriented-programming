package ListaExercicios;

import java.util.Scanner;

public class Exercicio4_V2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        System.out.println("Responda 1 p SIM e 0 para NÃO ");
        int resposta =0;

        String [] perguntas = {"Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"};

        for(int i = 0; i<perguntas.length; i++){
            System.out.println(perguntas[i]);
            resposta = entrada.nextInt();
            if (resposta == 1){
                cont++;
            }
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
