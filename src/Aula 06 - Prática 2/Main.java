package Aula06;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Printer impressora = new Printer("Epson", "wifi",
                LocalDate.of(2021, 05, 27));
        System.out.println(impressora.getDataFabricacao());
        impressora.setFolhasDisponiveis(100);
        impressora.imprimir("Olá mundo");
        System.out.println(impressora.getFolhasDisponiveis());
    }
}
