package ListaExercicios2.Exercicio3Ingresso;

import java.text.NumberFormat;

public class VIP extends Ingresso {
//    Attributes
    private float valorAdicional;

//    Constructor
    public VIP(float valor, float valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

//    Getters/Setters
    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

//    Methods
    public float valorIngressoVIP() {
        float ingressoVIP = super.getValor() + this.valorAdicional;
        return ingressoVIP;
    }
}
