package Aula13.Imposto;

public class ContaPoupanca extends Conta{
//    Constructor
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

//    Methods
    @Override
    public void sacar(double valor) {
        if (valor <= informarSaldo())
            setSaldo(informarSaldo() - valor);
        else
            System.out.println("Não tem limite!");
    }

    public void cobrarJuros() {
        double juros = 0.05;
        setSaldo(informarSaldo() * (1 + juros));
    }
}
