package Aula11.Animais;

public class Cachorro extends Animal{

//    Constructor
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

//    Methods
    @Override
    public void emitirSom() {
        System.out.println("Latir");
    }

    public void correr() {
        System.out.println("Correndo...");
    }
}
