package Aula12.Funcionario;

import java.text.NumberFormat;

public class AssistenteTecnico extends Assistente{
//    Attributes
    private double bonus;

//    Constructor
    public AssistenteTecnico(String nome, double salario, String numeroMatricula, double bonus) {
        super(nome, salario, numeroMatricula);
        this.bonus = bonus;
    }

//    Methods
    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + this.bonus;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Bonus salarial: " + NumberFormat.getCurrencyInstance().format(this.bonus));
    }
}
