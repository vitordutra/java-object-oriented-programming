package Aula15.ResolucaoPessoal;

public class Capitao {
//    Attributes
    private String nome;
    private String sobrenome;
    private String registroNavegacao;

//    Constructor
    public Capitao(String nome, String sobrenome, String registroNavegacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.registroNavegacao = registroNavegacao;
    }

//    Getters/Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRegistroNavegacao() {
        return registroNavegacao;
    }

    public void setRegistroNavegacao(String registroNavegacao) {
        this.registroNavegacao = registroNavegacao;
    }

//    Methods
}
