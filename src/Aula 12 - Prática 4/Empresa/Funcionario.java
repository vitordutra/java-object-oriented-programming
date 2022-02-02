package Aula12.Empresa;

public abstract class Funcionario {

//    Attributes
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private String matricula;

//    Constructor
    public Funcionario(String nome, String sobrenome, String cpf, String email, String matricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.matricula = matricula;
    }

//    Getters/Setters

//    Methods
    public abstract void pagamento();
}
