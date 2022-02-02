package Aula11.Animais;

public class Cavalo extends Animal{

//    Constructor
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

//    Methods
    @Override
    public void emitirSom() {
        System.out.println("Relinchar");
    }

    public void correr() {
        System.out.println("Galopando");
    }
}
