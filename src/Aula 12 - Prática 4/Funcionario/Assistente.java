package Aula12.Funcionario;

import java.text.NumberFormat;

public class Assistente extends Funcionario{
//    Attributes
    private String numeroMatricula;

//    Constructor
    public Assistente(String nome, double salario, String numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

//    Getters/Setters

//    Methods
    @Override
    public void exibeDados() {
        System.out.println(getClass() + "\nNome: " + this.nome +
                "\nNúmero Matrícula: " + this.numeroMatricula +
                "\nSalário: " + NumberFormat.getCurrencyInstance().format(this.salario));
    }
}
