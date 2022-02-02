package Aula15.ResolucaoPessoal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome da(o) capitã(o): ");
        String nameCap = scan.next();
        System.out.println("Sobrenome da(o) capitã(o): ");
        String surnameCap = scan.next();
        System.out.println("Registro da embarcação: ");
        String register = scan.next();
        Capitao capitao = new Capitao(nameCap, surnameCap, register);

        System.out.println("Ano de fabricação: ");
        int ano = scan.nextInt();
        System.out.println("Comprimento: ");
        double comprim = scan.nextDouble();
        System.out.println("Aluguel - Preço base: ");
        double priceBase = scan.nextDouble();
        System.out.println("Aluguel - Valor adicional: ");
        double aluguel = scan.nextDouble();
        System.out.println("Tipo de embarcação \n1-Veleiro \n2-Iate ");
        int tipo = scan.nextInt();
        switch (tipo) {
            case 1:
                System.out.println("Número de mastros: ");
                int mastros = scan.nextInt();
                Veleiro veleiro = new Veleiro(priceBase, aluguel, ano, comprim, capitao, mastros);
                System.out.println("\nAluguel do veleiro");
                veleiro.calcularAluguel();
                veleiro.avaliarTamanho();
                break;
            case 2:
                System.out.println("Número de cabines: ");
                int cabines = scan.nextInt();
                Iate iate = new Iate(priceBase, aluguel, ano, comprim, capitao, cabines);
                System.out.println("\nAluguel do iate");
                iate.calcularAluguel();
                break;
            default:
                System.out.println("Esse tipo de embarcação não está disponível!" +
                        "\nTente novamente mais tarde");
        }
        scan.close();
    }
}
