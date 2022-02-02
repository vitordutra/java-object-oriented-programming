package Aula20.CarrinhoDeCompras;

public class Vazio implements Estado {
//    Attributes
    private CarrinhoCompras carrinhoCompras;

//    Constructor
    public Vazio(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

//    Methods
    @Override
    public void adicionarProduto() {
        carrinhoCompras.setEstado(new Carregando(carrinhoCompras));
        System.out.println("Carrinho pode receber produtos agora");
    }

    @Override
    public void cancelar() {
        System.out.println("Carrinho já está vazio!");
    }

    @Override
    public void retornar() {
        System.out.println("Carrinho já está vazio!");
    }

    @Override
    public void proximo() {
        carrinhoCompras.setEstado(new Carregando(carrinhoCompras));
        System.out.println("Carrinho pode receber produtos agora");
    }
}
