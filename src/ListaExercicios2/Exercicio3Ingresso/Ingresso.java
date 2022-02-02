package ListaExercicios2.Exercicio3Ingresso;

import java.text.NumberFormat;

public class Ingresso {
//    Attributes
    private float valor;

//    Constructor
    public Ingresso(float valor) {
        this.valor = valor;
    }

//    Getters/Setters
    public float getValor() {
        return valor;
    }

    public String getValorFormatado(float valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.valor);
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

//    Methods
    public void imprimeValor() {
        System.out.println("Valor do ingresso: " + this.valor);
    }
}
