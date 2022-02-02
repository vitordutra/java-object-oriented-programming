package Aula13.Imposto;

public abstract class Conta {
//    Attributes
    private double saldo;

//    Constructor
    public Conta(double saldo) {
        this.saldo = saldo;
    }

//    Getter/Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

//    Methods
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito efetuado com sucesso!");
    }

    public abstract void sacar(double valor);

    public double informarSaldo() {
        return this.saldo;
    }
}
