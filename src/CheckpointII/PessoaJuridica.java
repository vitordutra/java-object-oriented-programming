package CheckpointII;

public class PessoaJuridica extends Cliente{
//    Attributes
    private String cnpj;
    private String nomeFantasia;

//    Constructor
    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    //    Methods
    @Override
    public String toString() {
        return "Cliente - Pessoa Jurídica" +
                "\nNome: " + nome +
                "\nNome Fantasia: " + this.nomeFantasia +
                "\nEndereco: " + endereco +
                "\nTelefone: " + telefone +
                "\nCNPJ: " + this.cnpj;
    }
}
