package Aula22.Trem;

public class Main {
    public static void main(String[] args) {
        Trem trem = new Trem();

        Figura figura1 = new Retangulo("Retângulo 5x4", 5, 4);
        Figura figura2 = new Retangulo("Retângulo 6x4", 6, 4);
        Figura figura3 = new Circulo("Círculo raio 1", 1);
        Figura figura4 = new Triangulo("Triângulo 2x2", 2, 2);
        Figura vagao = new Composto("Vagão");
        Figura locomotiva = new Composto("Locomotiva");

        // Vagão com um retângulo de 5X4 e três círculos de raio 1.
        ((Composto)vagao).inserirFigura(figura1);
        for (int i = 0; i < 3; i++) {
            ((Composto)vagao).inserirFigura(figura3);
        }
        ((Composto)vagao).mostrarFiguras();
        System.out.println(((Composto)vagao).calcularArea());

        // Locomotiva com um retângulo 6X4, dois círculos de raio 1, um triângulo de 2X2
        ((Composto)locomotiva).inserirFigura(figura2);
        for (int i = 0; i < 2; i++) {
            ((Composto)locomotiva).inserirFigura(figura3);
        }
        ((Composto)locomotiva).inserirFigura(figura4);
        ((Composto)locomotiva).mostrarFiguras();
        System.out.println(((Composto)locomotiva).calcularArea());

        // Um trem possui 1 vagão e 1 locomotiva
        trem.adicionarFigura(vagao);
        trem.adicionarFigura(locomotiva);
        trem.mostrarFiguras();
        // Área do trem
        System.out.println(trem.areaTotal());
    }
}
