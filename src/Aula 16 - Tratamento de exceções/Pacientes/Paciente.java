package Aula16.Pacientes;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String rg;
    LocalDate dataInternacao;
    LocalDate dataAlta;


    Paciente(String nome, String sobrenome, String rg, LocalDate dataInternacao) throws PacienteException {
        LocalDate hoje= LocalDate.now();
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.rg = rg;
        dataAlta=null;
        if (dataInternacao.isBefore(hoje))
            this.dataInternacao=dataInternacao;
        else
            throw new PacienteException("Data de internação inválida! A data é posterior a data atual");
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta) throws PacienteException {
        if (dataAlta.isAfter(dataInternacao))
            System.out.println("Pode dar alta!");
        else
            throw new PacienteException("Data da alta inválida. " +
                    "Não é possível liberar paciente");
    }
}
