package AulaExtraII.Academia;

import java.util.Scanner;

public class Academia {
    //  Attributes
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    //  Class Constructor
    public Academia(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura / 100;
        this.peso = peso;
        this.imc = 0;
    }

    //    Getters/Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    //    Methods
    public void calcularIMC() {
        this.imc = this.peso/Math.pow(this.altura, 2);
        if (this.imc < 18.5) {
            System.out.println("Você está abaixo do peso ideal!");
        } else if (this.imc > 25) {
            System.out.println("Você está acima do peso ideal");
        } else {
            System.out.println("Você está com o peso ideal");
        }
    }

}
