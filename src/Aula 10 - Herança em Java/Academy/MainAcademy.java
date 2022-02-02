package Aula10.Academy;

import Aula10.Academy.Associado;
import Aula10.Academy.AssociadoHabilitado;

public class MainAcademy {
    public static void main(String[] args) {
//        Method Associado
        Associado associado = new Associado("123", "Yana", 90, "Musculação");
//        Printing in console
//        System.out.println(associado.custoMensal());
        System.out.println(associado);

//        Method
        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("456", "Chris",
                120, "Natação", 50);
//        Change habilitado = true
        associadoHabilitado.setHabilitado(true);
//        Printing in console
//        System.out.println(associadoHabilitado.custoMensal());
    }
}
