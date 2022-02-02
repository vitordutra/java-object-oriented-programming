package ListaExercicios2.Exercicio2CarroCorrida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Número do carro: ");
        int numeroVeiculo = scan.nextInt();
        System.out.println("Piloto: ");
        String pilot = scan.next();
        System.out.println("Equipe: ");
        String equip = scan.next();
        System.out.println("Velocidade máxima (km/h): ");
        float velocidadeMax = scan.nextFloat();
        CarroCorrida carro = new CarroCorrida(numeroVeiculo, pilot, equip, velocidadeMax);

//        Informações do veículo
        carro.toString();
        System.out.println(carro.isLigado() ? "O veículo está LIGADO" : "O veículo está DESLIGADO" + "\n");

//        Modificando o piloto
        System.out.println("Novo piloto: ");
        String novoPiloto = scan.next();
        carro.setPiloto(novoPiloto);

//        Modificando a equipe
        System.out.println("Nova equipe: ");
        String novaEquipe = scan.next();
        carro.setEquipe(novaEquipe);

//        Exibindo novo piloto e nova equipe
        System.out.println("\nNovo piloto: " + carro.getPiloto());
        System.out.println("Nova equipe: " + carro.getEquipe() + "\n");

//        Ligando veículo
        carro.ligar();

//        Acelerando para velocidade desejada
        System.out.println("Velocidade que deseja chegar: ");
        float velocidadeDesejada = scan.nextFloat();
        carro.acelerar(velocidadeDesejada);

//        Freando (40%)
        System.out.println("Porcentagem de uso do freio: ");
        float porcentagemFreio = scan.nextFloat();
        carro.frear(porcentagemFreio);

//        Desejo desligar o veículo. É possível?
        carro.desligar();
//        Caso não seja possível, reduzir até parar
        carro.parar();
//        Desligar o veículo
        carro.desligar();
//        Verificar se veículo foi desligado corretamente (this.ligado = false)
        System.out.println(carro.isLigado());
    }
}
