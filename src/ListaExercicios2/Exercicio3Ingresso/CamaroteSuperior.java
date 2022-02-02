package ListaExercicios2.Exercicio3Ingresso;

import java.text.NumberFormat;

public class CamaroteSuperior extends VIP {
//    Atributte
    private float somaValor;

//    Constructor
    public CamaroteSuperior(float valor, float valorAdicional, float somaValor) {
        super(valor, valorAdicional);
        this.somaValor = somaValor;
    }

//    Getter/Setter
    public float getSomaValor() {
        return somaValor;
    }

    public void setSomaValor(float somaValor) {
        this.somaValor = somaValor;
    }

    //    Method
    public float ingressoCamaroteSuperior() {
        float camaroteSuperior = super.valorIngressoVIP() + this.somaValor;
        return camaroteSuperior;
    }
}
