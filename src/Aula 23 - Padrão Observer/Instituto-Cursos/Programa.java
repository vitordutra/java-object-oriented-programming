package Aula23;

import java.util.ArrayList;

public class Programa extends Ofertas {
    private ArrayList<Curso> listaCursos = new ArrayList<>();
    private double desconto;

    public Programa(String nome, String descricao, double desconto) {
        super(nome, descricao);
        this.desconto = desconto;
    }

    public void addCurso(Curso curso) {
        listaCursos.add(curso);
    }

    public void mostrarCursos(){
        System.out.println("Cursos que compõem o programa");
        for (Curso curso: listaCursos) {
            System.out.println(curso.getNome());
            System.out.println("Valores");
            System.out.println(curso.calcularPreco());
        }
    }

    @Override
    public double calcularPreco() {
        double soma = 0;
        for (Curso curso: listaCursos) {
            soma += curso.calcularPreco();
        }
        return soma * (1 - (desconto/100));
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", listaCursos=" + listaCursos +
                ", desconto=" + desconto + "%" +
                ", preço calculado=" + calcularPreco() +
                '}';
    }
}
