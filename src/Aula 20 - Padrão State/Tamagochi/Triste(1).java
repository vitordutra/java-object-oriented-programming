package Aula20.Tamagochi;

public class Triste implements Estado {

//    Attributes
    private Tamagochi tamagochi;

//    Constructor
    public Triste(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

//    Methods
    @Override
    public void come() {
        System.out.println("Beep, beep ... vomitando");
    }

    @Override
    public void bebe() {
        System.out.println("Beep, beep, beep ... piscando!!");
    }

    @Override
    public void carinho() {
        tamagochi.setEstado(new Feliz(tamagochi));
    }
}
