package CheckpointII;

public abstract class Cliente {
//    Attributes
    protected String nome;
    protected String endereco;
    protected String telefone;

//    Constructor
    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

//    Methods
    public abstract String toString();
}
