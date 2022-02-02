package Aula20.CarrinhoDeCompras;

public class Pagando implements Estado {
//    Attributes
    private CarrinhoCompras carrinhoCompras;

//    Constructor
    public Pagando(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

//    Methods
    @Override
    public void adicionarProduto() {
        System.out.println("Carrinho não aceita mais produtos!");
    }

    @Override
    public void cancelar() {
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));
        carrinhoCompras.limparCarrinho();
        System.out.println("Carrinho foi esvaziado");
    }

    @Override
    public void retornar() {
        carrinhoCompras.setEstado(new Carregando(carrinhoCompras));
        System.out.println("Carrinho foi reaberto para adição de produtos");
    }

    @Override
    public void proximo() {
        carrinhoCompras.setEstado(new Fechado(carrinhoCompras));
        System.out.println("Carrinho fechado e compra finalizada");
    }
}
