package Aula19.Armazem;

import java.util.ArrayList;

public class Armazem {
    private ArrayList<Produto> listaProduto = new ArrayList<>();

    public Armazem() {};

    public double calcularEspacoNecessario(){
        double total = 0;
        for (Produto produto : listaProduto) {
            total += produto.calcularEspaco();
        }
        return total;
    }

    public void addEspaco(Produto produto) {
        listaProduto.add(produto);
    }
}
