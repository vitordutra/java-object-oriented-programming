package Aula12.Empresa;

public class Secretaria extends Funcionario {
//    Attributes
    private double salario;

//    Constructor
    public Secretaria(String nome, String sobrenome, String cpf, String email, String matricula,
                      double salario) {
        super(nome, sobrenome, cpf, email, matricula);
        this.salario = salario;
    }

//    Getters/Setters
//    Methods
    @Override
    public void pagamento() {
        System.out.println("O seu salário é de " + salario);
    }
}
