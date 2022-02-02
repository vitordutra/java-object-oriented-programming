package Aula12.Funcionario;

public class AssistenteAdministrativo extends Assistente{
//    Attributes
    private String turno;

//    Constructor
    public AssistenteAdministrativo(String nome, double salario, String numeroMatricula, String turno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
    }

//    Methods
    @Override
    public double ganhoAnual() {
        if (turno.equals("noite"))
            return super.ganhoAnual() * 1.3;
        else
            return super.ganhoAnual();
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Turno de Trabalho: " + this.turno);
    }
}
