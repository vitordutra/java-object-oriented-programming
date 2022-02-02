package Aula20.Tamagochi;

public class Feliz implements Estado {
//    Attributes
    private Tamagochi tamagochi;

//    Constructor
    public Feliz(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

//    Methods
    @Override
    public void come() {
        System.out.println("Come come!");
    }

    @Override
    public void bebe() {
        System.out.println("Beep, beep, beep, beep, beep!!");
    }

    @Override
    public void carinho() {
        System.out.println("Cut cut");
    }
}
