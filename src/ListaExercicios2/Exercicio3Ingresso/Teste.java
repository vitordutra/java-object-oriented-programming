package ListaExercicios2.Exercicio3Ingresso;

import java.text.NumberFormat;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Valor do ingresso convencional (em reais):");
        float ticketCost = scan.nextFloat();
        System.out.println("Valor adicional do ingresso VIP (em reais): ");
        float vipTax = scan.nextFloat();
        System.out.println("Taxa para camarote superior (em reais): ");
        float camaroteSuperior = scan.nextFloat();

//        Converter valores para moeda local
        NumberFormat nf = NumberFormat.getCurrencyInstance();

//        Instanciando os objetos
        Ingresso ticket = new Ingresso(ticketCost);
        VIP ticketVIP = new VIP(ticketCost, vipTax);
        CamaroteSuperior ticketVIPSup = new CamaroteSuperior(ticketCost, vipTax, camaroteSuperior);

//        Escolhas do Usuário
        System.out.println("Qual o tipo de ingresso desejado?" +
                "\n1 - Normal" +
                "\n2 - VIP");
        int tipoTicket = scan.nextInt();
        switch (tipoTicket) {
            case 1:
                System.out.println("\nIngresso Normal \nValor: " + nf.format(ticket.getValor()));
                break;
            case 2:
                System.out.println("\nIngresso VIP");
                System.out.println("\nQual camarote desejado?" +
                        "\n1 - Camarote Superior" +
                        "\n2 - Camarote Inferior");
                int camaroteEscolhido = scan.nextInt();
                switch (camaroteEscolhido) {
                    case 1:
                        System.out.println("Camarote Superior \nValor: "
                                + nf.format(ticketVIPSup.ingressoCamaroteSuperior()));
                        break;
                    case 2:
                        System.out.println("Camarote Inferior \nValor: "
                                + nf.format(ticketVIP.valorIngressoVIP()));
                } break;
            default:
                System.out.println("Opção inválida! Tente novamente!");
        }
        scan.close();
    }
}
