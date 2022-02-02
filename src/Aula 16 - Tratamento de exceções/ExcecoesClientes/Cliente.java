package Aula16.ExcecoesClientes;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;
    private double divida;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.limite= limite;
        divida = 0;
        saldoEmConta=0;
    }
    public void comprar(double valor) throws ClientesException {
        if (saldoEmConta + limite < valor)
            throw new ClientesException("Saldo insuficiente!");
        else
            saldoEmConta-=valor;
    }

    public void pagarDivida(double valor) throws ClientesException
    {
        if (divida <= 0 )
            throw new ClientesException("Você não tem dívida");
        else
            divida-=valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                nome + ' ' +
                sobrenome + ' ' +
                ", seu saldo é=" + saldoEmConta + "R$ }";
    }
}