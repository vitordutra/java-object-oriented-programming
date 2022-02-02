package CheckpointII;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public abstract class ContaBanco {
//    Attributes
    private double saldo;
    private Date dataAbertura;

//    Class Constructor
    public ContaBanco(double saldo, Date dataAbertura) {
        this.saldo = 0;
        this.dataAbertura = new Date();
        System.out.println("Abertura de conta feita com sucesso");
    }

//    Getters/Setters
    public double getSaldo() {
        return saldo;
    }

    public String getSaldoFormatado(double saldo) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataAberturaFormatada() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return df.format(this.dataAbertura);
    }

    // Methods
    public void depositar(double quantia) {
        setSaldo(getSaldo() + quantia);
        System.out.println("Depósito efetuado com sucesso!");
    }

    public abstract void sacar(double valor);

    public void informarSaldo() {
        System.out.println("O saldo desta conta é: " + getSaldoFormatado(getSaldo()));
    }
}
