package Aula15.Embarcacoes;

public class Capitao {
    private String nome;
    private String sobrenome;
    private String registroNavegacao;

    public Capitao(String nome, String sobrenome, String registroNavegacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.registroNavegacao = registroNavegacao;
    }

    @Override
    public String toString() {
        return "Capitao{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", registroNavegacao='" + registroNavegacao + '\'' +
                '}';
    }

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
}
