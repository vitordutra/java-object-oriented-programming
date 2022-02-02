package CheckpointII;

import java.util.Date;

public class ContaCorrente extends ContaBanco implements Imposto {
//    Attributes
    private double valorPermitido;

//    Constructor
    public ContaCorrente(double saldo, Date dataAbertura, double valorPermitido) {
        super(saldo, dataAbertura);
        this.valorPermitido = valorPermitido;
    }

//    Getters/Setters
//    Methods
    @Override
    public void sacar(double valor) {
        if (super.getSaldo() < valor) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso");
        }
    }

    @Override
    public double imposto(double porc) {
        if (super.getSaldo() > 0)
            return getSaldo()*(porc/100);
        else
            return 0;
    }
}
