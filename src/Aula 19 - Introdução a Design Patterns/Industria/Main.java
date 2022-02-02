package Aula19.Industria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Empresa - CNPJ: ");
        String cnpj = scan.next();
        Empresa empresa = new Empresa(cnpj);

        System.out.println("\nFuncionário");
        System.out.println("Nome: ");
        String nome = scan.next();
        System.out.println("Sobrenome: ");
        String sobrenome = scan.next();
        System.out.println("Arquivo: ");
        String arquivo = scan.next();
        System.out.println("Valor por hora (R$): ");
        double valorPorHora = scan.nextDouble();
        System.out.println("Salário Mensal (R$): ");
        double salarioMensal = scan.nextDouble();
        System.out.println("Alíquota do imposto: ");
        double imposto = scan.nextDouble();

        EmpregadoFactory factory = EmpregadoFactory.getInstance();

        int i = 0;
        while (i != 0) {
            System.out.println("Tipo de empregado: ");
            String tipo = scan.next();
            if (tipo.equals("EMP-INT") || tipo.equals("EMP-EXT")) {
                empresa.addEmpregado(factory.criarEmpregado(tipo, nome, sobrenome, arquivo, salarioMensal,
                        valorPorHora, imposto));
                i = 1;
                break;
            } else {
                System.out.println("Tipo de empregado inexistente. Insira uma categoria de empregado existente");
                break;
            }
        }
        scan.close();
    }
}
