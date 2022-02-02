package Aula20.CarrinhoDeCompras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Produto 1");
        System.out.println("Descrição: ");
        String descr1 = scan.nextLine();
        System.out.println("Preço (R$): ");
        double preco1 = scan.nextDouble();
        Produto produto1 = new Produto(descr1, preco1);
        scan.nextLine();

        System.out.println("Produto 2");
        System.out.println("Descrição: ");
        String descr2 = scan.nextLine();
        System.out.println("Preço (R$): ");
        double preco2 = scan.nextDouble();
        Produto produto2 = new Produto(descr2, preco2);
        scan.nextLine();
        scan.close();

        CarrinhoCompras carrinho = new CarrinhoCompras();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.listarProdutos();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.proximo();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.cancelar();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.proximo();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.proximo();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.cancelar();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
        carrinho.proximo();
        System.out.println(carrinho.getEstado().getClass());
        System.out.println("====================");
    }
}
