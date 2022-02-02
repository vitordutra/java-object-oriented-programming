package Aula16.ExcecoesClientes;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scan.next();
        System.out.println("Sobrenome: ");
        String sobrenome = scan.next();
        System.out.println("RG: ");
        String rg = scan.next();
        System.out.println("Informe seu limite(R$): ");
        double limite = scan.nextDouble();
        Cliente cliente = new Cliente(nome, sobrenome, rg, limite);
        System.out.println("Valor da compra (R$): ");
        double compra = scan.nextDouble();
        try {
            cliente.comprar(compra);
        } catch (ClientesException e) {
            System.err.println(e);
        }
        scan.close();
    }
}
