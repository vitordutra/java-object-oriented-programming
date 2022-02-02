package Aula20.Tamagochi;

public class Sede implements Estado {
//    Attributes
    private Tamagochi tamagochi;

//    Constructor
    public Sede(Tamagochi tamagochi) {
        this.tamagochi = tamagochi;
    }

//    Methods
    @Override
    public void come() {
        System.out.println("Estou com sede!!!!");
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
