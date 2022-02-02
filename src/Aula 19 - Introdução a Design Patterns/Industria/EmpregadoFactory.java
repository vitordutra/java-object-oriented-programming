package Aula19.Industria;

public class EmpregadoFactory {
//    Singleton pattern
    private static EmpregadoFactory instance;
    private EmpregadoFactory() {}

    public static EmpregadoFactory getInstance() {
        if (instance == null)
            instance = new EmpregadoFactory();
        return instance;
    }

//    Factory pattern
    public Empregado criarEmpregado(String tipo, String nome, String sobrenome, String arquivo, double salarioMensal,
                                    double valorPorHora, double imposto) {
        if (tipo.equals("EMP-INT"))
            return new EmpregadoRelacaoDep(nome, sobrenome, arquivo, salarioMensal);
        else if (tipo.equals("EMP-EXT"))
            return new EmpregadoContratado(nome, sobrenome, arquivo, valorPorHora, imposto);
        else
            return null;
    }

}
