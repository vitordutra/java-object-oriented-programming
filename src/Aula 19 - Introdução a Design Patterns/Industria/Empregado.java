package Aula19.Industria;

public abstract class Empregado {

    private String nome;
    private String sobrenome;
    private String arquivo;

    public Empregado(){}
    public Empregado(String nome, String sobrenome, String arquivo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.arquivo = arquivo;
    }

    public abstract double calcularSalario(int dias);

    public String getNome() {
        return nome;
    }

    public Empregado setNome(String nome) {
        this.nome = nome;
        return null;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
