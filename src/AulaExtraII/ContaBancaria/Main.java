package AulaExtraII.ContaBancaria;

import AulaExtraII.ContaBancaria.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Saldo atual: " + conta.getSaldoFormatado());
        System.out.println("Data de abertura: " + conta.getDataAberturaFormatada());

//        Efetuar um depósito (quantia vem do teclado)
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        double valorDeposito = entrada.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Saldo atual: " + conta.getSaldoFormatado());

//        Efetuar um saque (quantia vem do teclado)
        System.out.println("Digite o valor do saque: ");
        double valorSaque = entrada.nextDouble();
        conta.sacar(valorSaque);
        System.out.println("Saldo atual: " + conta.getSaldoFormatado());

//        Saque maior que o saldo
        conta.sacar(60.89);
        System.out.println("Saldo atual: " + conta.getSaldoFormatado());

    }
}
