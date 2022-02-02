package Aula14.PortoBuenosAires;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cidade do Porto: ");
        String cidade = scan.next();
        SistemaPorto porto = new SistemaPorto(cidade);
        System.out.println("Quantidade de containers: ");
        int quantidade = scan.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Container ID: ");
            int id = scan.nextInt();
            System.out.println("Descrição (tipo de produto): ");
            String descr = scan.next();
            System.out.println("País de origem: ");
            String pais = scan.next();
            System.out.println("Material perigoso? \ntrue = sim \nfalse = não");
            boolean perigoso = scan.nextBoolean();
            Container container = new Container(id, descr, pais, perigoso);
            porto.entrada(container);
        }
        System.out.println();
        porto.mostrarContainer();
        System.out.println("\nQuantidade de containers perigosos de origem desconhecida: "
                + porto.quantidadeContainerPerigoso());

        scan.close();
    }
}
