package Aula20.Tamagochi;

public class Tamagochi {
//    Attributes
    private Estado estado;

//    Constructor
    public Tamagochi() {
        setEstado(new Triste(this)); // inicia com estado Triste
    }

//    Getters/Setters
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

//    Methods
    public void come(){
        getEstado().come();
    }

    public void bebe(){
        getEstado().bebe();
    }

    public void carinho(){
        getEstado().carinho();
    }

}
