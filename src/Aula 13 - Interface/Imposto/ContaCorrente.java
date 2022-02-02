package Aula13.Imposto;

public class ContaCorrente extends Conta implements GravarImposto {
//    Attributes
    private double valorPermitido;

//    Constructor
    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

//    Getters/Setters
//    Methods
    @Override
    public void sacar(double valor) {
        if (valor <= informarSaldo())
            setSaldo(informarSaldo() - valor);
        else
            System.out.println("Não tem limite!");
    }

    @Override
    public double imposto(double porc) {
        return 0;
    }
}
