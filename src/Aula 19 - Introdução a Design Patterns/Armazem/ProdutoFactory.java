package Aula19.Armazem;

import java.util.Scanner;

public class ProdutoFactory {
    Scanner scan = new Scanner(System.in);

//    Singleton pattern
    private static ProdutoFactory instance;
    private ProdutoFactory() {}

    public static ProdutoFactory getInstance() {
        if (instance == null)
            instance = new ProdutoFactory();
        return instance;
    }

//    Factory pattern
    public Produto criarProduto(String categoria) {
        System.out.println("Peso: ");
        double peso = scan.nextDouble();
        switch (categoria) {
            case "Caixa": {
                System.out.println("Dimensões da Caixa (em cm)");
                System.out.println("Comprimento: ");
                double comprimento = scan.nextDouble();
                System.out.println("Altura: ");
                double altura = scan.nextDouble();
                System.out.println("Largura: ");
                double largura = scan.nextDouble();
                return new Caixa(peso, comprimento, altura, largura);
            } case "Bola": {
                System.out.println("Raio da Bola (em cm)");
                double raio = scan.nextDouble();
                return new Bola(peso, raio);
            } default: {
                System.out.println("Entre com uma categoria válida!");
                return null;
            }
        }
    }
}
