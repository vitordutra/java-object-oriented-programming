package Aula02;

import java.util.Scanner;

public class AtvProf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        String sobrenome = entrada.nextLine();

        int dia = entrada.nextInt();
        int mes = entrada.nextInt();
        int ano = entrada.nextInt();

        char inicialN = nome.charAt(0);
        char inicialS = sobrenome.charAt(0);

        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome
                            + "\nIniciais: " + inicialN + " " + inicialS +
                            "\nData de Nascimento: " + dia + "/" + mes + "/" + ano);
    }
}
