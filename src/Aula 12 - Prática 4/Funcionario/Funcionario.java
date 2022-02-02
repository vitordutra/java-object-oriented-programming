package Aula12.Funcionario;

import java.text.NumberFormat;

public abstract class Funcionario {
//    Attributes
    protected String nome;
    protected double salario;

//    Constructor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

//    Methods
    public String addAumento(double valor) {
        System.out.println("O aumento é de: " + valor);
        this.salario +=valor;
        return "O novo salário é de " + NumberFormat.getCurrencyInstance().format(this.salario);
    };

    public double ganhoAnual() {
        return this.salario * 12;
    };

    public abstract void exibeDados();
}
