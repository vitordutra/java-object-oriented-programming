package Aula12.Funcionario;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Assistente administrativo");
        System.out.println("Nome: ");
        String name = scan.next();
        System.out.println("Salário: ");
        double salary = scan.nextDouble();
        System.out.println("Matrícula: ");
        String matricula = scan.next();
        System.out.println("Turno de trabalho: ");
        String turno = scan.next();
        AssistenteAdministrativo administrativo = new AssistenteAdministrativo(name, salary, matricula, turno);

        System.out.println("\nAssistente técnico");
        System.out.println("Nome: ");
        String nameTec = scan.next();
        System.out.println("Salário: ");
        double salaryTec = scan.nextDouble();
        System.out.println("Matrícula: ");
        String matriculaTec = scan.next();
        System.out.println("Bônus: ");
        Double bonus = scan.nextDouble();
        AssistenteTecnico tecnico = new AssistenteTecnico(nameTec, salaryTec, matriculaTec, bonus);
        scan.close();

        System.out.println();
        administrativo.exibeDados();
        System.out.println("===============");
        tecnico.exibeDados();

    }
}
