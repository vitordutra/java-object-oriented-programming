package Aula11.Animais;

public abstract class Animal {

//    Attributes
    private String nome;
    private int idade;

//    Constructor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

//    Getters/Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //    Methods
    public abstract void emitirSom();
}
