package Aula19.Armazem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de produtos a serem armazenados: ");
        int quantidadeProduto = scan.nextInt();
        scan.nextLine();
        Armazem armazem = new Armazem();

        for (int i = 0; i < quantidadeProduto; i++) {
            ProdutoFactory factory = ProdutoFactory.getInstance();
            System.out.println("Categoria do produto: \nCaixa \nBola");
            String categoriaProd = scan.nextLine();
            armazem.addEspaco(factory.criarProduto(categoriaProd));
        }
        System.out.println("O espaço necessário é de: " + armazem.calcularEspacoNecessario() + " cm3");
    }
}
