package Aula10.Academy;

import Aula10.Academy.Associado;

public class AssociadoHabilitado extends Associado {
//    Attributes
    private double custoPiscina;
    private boolean habilitado;

//    Constructor
    public AssociadoHabilitado(String numAssociado, String nome, double valorMensal, String atividade,
                               double custoPiscina) {
        super(numAssociado, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
    }

//    Getters/Setters
    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

//    Methods
//    Overriding
    @Override
    public double custoMensal() {
        if (this.habilitado)
            return super.custoMensal() + this.custoPiscina;
        else
            return super.custoMensal();
    }
}
