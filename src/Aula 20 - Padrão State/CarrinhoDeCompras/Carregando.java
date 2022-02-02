package Aula20.CarrinhoDeCompras;

public class Carregando implements Estado {
//    Attributes
    private CarrinhoCompras carrinhoCompras;

//    Constructor
    public Carregando(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

//    Methods
    @Override
    public void adicionarProduto() {
        System.out.println("Carrinho já pode receber produtos");
    }

    @Override
    public void cancelar() {
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));
        carrinhoCompras.limparCarrinho();
        System.out.println("Carrinho foi esvaziado");
    }

    @Override
    public void retornar() {
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));
        carrinhoCompras.limparCarrinho();
        System.out.println("Carrinho foi esvaziado");
    }

    @Override
    public void proximo() {
        carrinhoCompras.setEstado(new Pagando(carrinhoCompras));
        System.out.println("Carrinho aguardando finalização da compra");
    }
}
