package Aula16.Pacientes;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        try {
            Paciente paciente = new Paciente("Juan","Perez","12345",
                    LocalDate.of(10,5,2021));
            System.out.println(paciente.getDataInternacao());
            paciente.darAlta(LocalDate.of(2020,12,30));
        } catch (PacienteException e) {
            System.err.println(e);
        }
    }
}
