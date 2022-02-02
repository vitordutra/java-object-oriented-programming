package Aula12.Empresa;

public class Vendedor extends Funcionario {
//    Attributes
    private double salario;
    private double comissao;

//    Constructor
    public Vendedor(String nome, String sobrenome, String cpf, String email, String matricula,
                    double salario, double comissao) {
        super(nome, sobrenome, cpf, email, matricula);
        this.salario = salario;
        this.comissao = comissao;
    }

//    Getters/Setters
//    Methods
    @Override
    public void pagamento() {
        System.out.println("O seu salário será de " + (salario+comissao));
    }
}
