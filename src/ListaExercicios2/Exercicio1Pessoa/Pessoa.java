package ListaExercicios2.Exercicio1Pessoa;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
//    Attributes
    private String nome;
    private int idade;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

//    Constructor
    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.idade = 0;
    }

//    Getters/Setters
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    //    Methods
    public void calculaIdade() {
        this.idade = Period.between(LocalDate.of(this.anoNascimento, this.mesNascimento, this.diaNascimento),
                LocalDate.now()).getYears();
    }

    public String informaIdade() {
        return "Idade: " + this.idade + " anos";
    }

    public String informaNome() {
        return "Nome: " + this.nome;
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        setDiaNascimento(dia);
        setMesNascimento(mes);
        setAnoNascimento(ano);
    }
}
