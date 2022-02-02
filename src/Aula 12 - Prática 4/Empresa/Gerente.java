package Aula12.Empresa;

public class Gerente extends Funcionario{
//    Attributes
    private double salario;
    private double bonus;

//    Constructor
    public Gerente(String nome, String sobrenome, String cpf, String email, String matricula,
                   double salario, double bonus) {
        super(nome, sobrenome, cpf, email, matricula);
        this.salario = salario;
        this.bonus = bonus;
    }

//    Getters/Setters
//    Methods
    @Override
    public void pagamento() {
        System.out.println("O seu salário será de " + (salario+bonus));
    }
}
