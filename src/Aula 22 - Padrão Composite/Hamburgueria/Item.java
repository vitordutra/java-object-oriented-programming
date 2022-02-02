package Aula22.Hamburgueria;

public abstract class Item {
    private String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularPreco();
}
