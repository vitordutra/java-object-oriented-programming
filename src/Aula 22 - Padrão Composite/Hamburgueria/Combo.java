package Aula22.Hamburgueria;

import java.util.ArrayList;

public class Combo extends Item {
    private ArrayList<Item> listaItem = new ArrayList<>();

    public Combo(String nome) {
        super(nome);
    }

    @Override
    public double calcularPreco() {
        double valorTotal = 0;
        for (Item item: listaItem) {
            valorTotal += item.calcularPreco();
        }
        return valorTotal;
    }

    public void inserirItem(Item item) {
        listaItem.add(item);
    }
}
