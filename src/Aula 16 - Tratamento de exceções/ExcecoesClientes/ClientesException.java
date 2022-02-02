package Aula16.ExcecoesClientes;

public class ClientesException extends Exception {
//    Constructor 1
    public ClientesException() {}

//    Constructor 2
    public ClientesException(String message) {
        super(message);
    }

//    Methods
    @Override
    public String toString() {
        return getMessage();
    }
}
