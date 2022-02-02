package Aula23;

import java.util.Scanner;

public class OfertasFactory {
    Scanner scan = new Scanner(System.in);

//    Factory pattern
    public Ofertas criarOferta(int tipo) {
        System.out.println("Nome: ");
        String nome = scan.nextLine();
        System.out.println("Descrição: ");
        String descricao = scan.nextLine();
        switch (tipo) {
            case 1:
                System.out.println("Carga Horária: ");
                int horasMes = scan.nextInt();
                System.out.println("Duração (meses): ");
                int numMeses = scan.nextInt();
                System.out.println("Preço por hora: ");
                double precoHora = scan.nextDouble();
                return new Curso(nome, descricao, horasMes, numMeses, precoHora);
            case 2:
                System.out.println("Desconto: ");
                double desconto = scan.nextDouble();
                return new Programa(nome, descricao, desconto);
            default: return null;
        }
    }
}
