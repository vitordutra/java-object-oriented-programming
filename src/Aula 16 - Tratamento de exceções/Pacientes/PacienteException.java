package Aula16.Pacientes;

public class PacienteException extends Exception {
//    Constructor 1
    public PacienteException() {}

//    Constructor 2
    public PacienteException(String message) {
        super(message);
    }

//    Methods
    @Override
    public String toString() {
        return getMessage();
    }
}
