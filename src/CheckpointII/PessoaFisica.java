package CheckpointII;

public class PessoaFisica extends Cliente {
//    Attributes
    private String cpf;

//    Constructor
    public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

//    Methods

    @Override
    public String toString() {
        return "Cliente - Pessoa Fisica" +
                "\nNome: " + nome +
                "\nEndereco: " + endereco +
                "\nTelefone: " + telefone +
                "\nCPF: " + cpf;
    }
}
