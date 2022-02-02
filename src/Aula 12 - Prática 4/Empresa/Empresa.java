package Aula12.Empresa;

import java.util.ArrayList;

public class Empresa {
//    Attributes
    private String nome;
    private String cnpj;
//    private Funcionario funcionario; (relacionamento 1 para 1)
//    Para relacionamento n para n (usamos colecoes - array dinamico [ArrayList])
    // ArrayList = um vetor dinamico que armazena tipo de dados indicado
    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

//    Constructor

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

//    Getters/Setters

//    Methods
    public void addFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }
}
