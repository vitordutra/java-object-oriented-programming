package Aula20.Tamagochi;

public class Fome implements Estado {
//    Attributes
    private Tamagochi tamagochi;

//    Constructor
    public Fome(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

    //    Methods
    @Override
    public void come() {
        tamagochi.setEstado(new Feliz(tamagochi));
    }

    @Override
    public void bebe() {
        tamagochi.setEstado(new Feliz(tamagochi));
    }

    @Override
    public void carinho() {
        System.out.println("Não toque em mim ...");
    }
}
