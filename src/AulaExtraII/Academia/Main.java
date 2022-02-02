package AulaExtraII.Academia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        Nome do aluno
        System.out.println("Digite seu nome: ");
        String nomeAluno = entrada.nextLine();
//        Idade
        System.out.println("Digite sua idade: ");
        int idadeAluno = entrada.nextInt();
//        Altura
        System.out.println("Digite sua altura (em cm): ");
        double alturaAluno = entrada.nextDouble();
//        Peso
        System.out.println("Digite seu peso (em kg): ");
        double pesoAluno = entrada.nextDouble();

//        Chamando construtor
        Academia aluno = new Academia(nomeAluno, idadeAluno, alturaAluno, pesoAluno);

//        Calculando o IMC
        aluno.calcularIMC();
    }

}
