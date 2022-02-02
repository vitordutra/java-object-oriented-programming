package Aula22.Hamburgueria;

public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Item item1 = new Produto("Refri", 10);
        Item item2 = new Produto("batata frita", 12);
        Item item3 = new Produto("Hamburguer", 25);
        Item item4 = new Combo("Combo feliz");
        ((Combo)item4).inserirItem(item1);
        ((Combo)item4).inserirItem(item2);
        ((Combo)item4).inserirItem(item3);

        carrinho.addItem(item4);
        carrinho.mostrarItem();
        System.out.println(carrinho.valorTotal());
    }
}
