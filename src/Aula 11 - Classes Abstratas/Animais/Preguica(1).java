package Aula11.Animais;

public class Preguica extends Animal{

//    Constructor
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

//    Methods
    @Override
    public void emitirSom() {
        System.out.println("Silêncio");
    }

    public void subirArvore() {
        System.out.println("Subindo na árvore");
    }
}
