package Aula20.CarrinhoDeCompras;

public class Fechado implements Estado {
//    Attributes
    private CarrinhoCompras carrinhoCompras;

//    Constructor
    public Fechado(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

//    Methods
    @Override
    public void adicionarProduto() {
        System.out.println("Carrinho não aceita mais produtos!");
    }

    @Override
    public void cancelar() {
        System.out.println("Carrinho já foi fechado!");
    }

    @Override
    public void retornar() {
        System.out.println("Carrinho já foi fechado!");
    }

    @Override
    public void proximo() {
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));
        carrinhoCompras.limparCarrinho();
        System.out.println("Carrinho foi esvaziado após finalização da compra");
    }
}
