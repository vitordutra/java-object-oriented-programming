package Aula17DesignPatterns;

public class EmpregadoFactory {

    // Começa Singleton
    private static EmpregadoFactory instance;

    private EmpregadoFactory(){}

    public static EmpregadoFactory getInstance() {
        if (instance == null) {
            instance = new EmpregadoFactory();
        }
        return instance;
    }
    // Termina Singleton

    // Começa Factory
    public Empregado criarEmpregado(String tipo) {
        if (tipo.equals("EMP-INT")) {
            return new EmpregadoRelacaoDependencia();
        } else if (tipo.equals("EMP-EXT")) {
            return new EmpregadoContratado();
        }
        return null;
    }
    // Termina Factory
}
