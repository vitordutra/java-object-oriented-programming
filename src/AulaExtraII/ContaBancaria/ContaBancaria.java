/*
Escreva uma classe Java chamada ContaBancaria para representar uma conta bancária.
Esta classe deverá conter:

a) Um campo de dados privado do tipo double chamado saldo que representa o saldo atual da conta.
O saldo padrão é 0.0.

b) Um campo de dados privado do tipo Date chamado dataAbertura que guarda a data da abertura
da conta bancária. O valor padrão é a data atual. Note que o campo dataAbertura é somente leitura,
ou seja, no momento da criação da conta, esta variável receberá a data atual e não poderá mais
ser alterada (não forneça o método set() para este campo).

c) Um construtor sem argumentos que cria uma nova conta com saldo 0.0 e com data de
abertura igual à data atual.

d) Métodos get() e set() para o campo saldo e apenas o método get() para o
campo dataAbertura.

e) Um método getDataAberturaFormatada() que retorna a data de abertura da conta como uma String.
Você deverá também formatar a data retornada com o objetivo de exibir algo como "12/05/2012".

f) Um método getSaldoFormatado() que retorna o saldo atual da conta como uma String
e formatado de acordo com o formato de moeda brasileira, ou seja, algo como "R$ 23.654,00".

g) Um método depositar() que recebe um valor do tipo double e atualiza o saldo atual da conta.

h) Um método sacar() que recebe um valor do tipo double representando o valor a ser sacado.
Não permita saques que farão com que a conta fique com saldo negativo.

Escreva uma classe de teste e, em seu método main(), crie uma nova instância
da classe ContaBancaria. Experimente efetuar depósitos e saques e observe o comportamento
da classe. Sua saída deverá ser parecida com a imagem abaixo:Ω
*  */

package AulaExtraII.ContaBancaria;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class ContaBancaria {
    //    Attribute
    private double saldo;
    private Date dataAbertura;

    // Class Constructor
    public ContaBancaria() {
        this.saldo = 0;
        this.dataAbertura = new Date();
        System.out.println("Abertura de conta feita com sucesso");
    }

    // Getters/Setters
    public double getSaldo() {
        return saldo;
    }

    public String getSaldoFormatado() {
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
        this.saldo += quantia;
        System.out.println("Novo depósito efetuado!");
    }

    public void sacar(double quantia) {
        if (this.saldo < quantia) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            this.saldo -= quantia;
            System.out.println("Saque efetuado com sucesso");
        }
    }

}


