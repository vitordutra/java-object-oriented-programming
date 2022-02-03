package Aula17DesignPatterns;

public class EmpregadoRelacaoDependencia extends Empregado {

    private double salarioMensal;

    public EmpregadoRelacaoDependencia() {}
    public EmpregadoRelacaoDependencia(String nome, String sobrenome, String arquivo, double salarioMensal) {
        super(nome, sobrenome, arquivo);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario(int dias) {
        return (this.salarioMensal / 30) * dias;
    }
}
