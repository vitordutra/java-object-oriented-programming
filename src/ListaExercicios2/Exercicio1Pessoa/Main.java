package ListaExercicios2.Exercicio1Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Pessoa 1 - Albert Einstein (14/03/1879)
        System.out.println("Nome: ");
        String nome1 = scan.nextLine();
        System.out.println("Dia de nascimento: ");
        int diaNascimento1 = scan.nextInt();
        System.out.println("Mês de nascimento: ");
        int mesNascimento1 = scan.nextInt();
        System.out.println("Ano de nascimento: ");
        int anoNascimento1 = scan.nextInt();

        Pessoa pessoa1 = new Pessoa(nome1, diaNascimento1, mesNascimento1, anoNascimento1);
        System.out.println(pessoa1.informaNome());
        pessoa1.calculaIdade();
        System.out.println(pessoa1.informaIdade());

//        Pessoa 2 - Isaac Newton (04/01/1643)
        System.out.println("Nome: ");
        String nome2 = scan.nextLine();
        System.out.println("Dia de nascimento: ");
        int diaNascimento2 = scan.nextInt();
        System.out.println("Mês de nascimento: ");
        int mesNascimento2 = scan.nextInt();
        System.out.println("Ano de nascimento: ");
        int anoNascimento2 = scan.nextInt();

        Pessoa pessoa2 = new Pessoa(nome2, diaNascimento2, mesNascimento2, anoNascimento2);
        System.out.println(pessoa2.informaNome());
        pessoa2.calculaIdade();
        System.out.println(pessoa2.informaIdade());
    }
}