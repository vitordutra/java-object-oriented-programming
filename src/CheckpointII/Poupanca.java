package CheckpointII;

import java.util.Date;

public class Poupanca extends ContaBanco{
//    Constructor
    public Poupanca(double saldo, Date dataAbertura) {
        super(saldo, dataAbertura);
    }

    //    Methods
    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo())
            setSaldo(getSaldo() - valor);
        else
            System.out.println("Não tem limite!");
    }

    public void cobrarJuros() {
        double juros = 0.01; // juros de 1% ao mês
        setSaldo(getSaldo() * (1 + juros));
    }
}
