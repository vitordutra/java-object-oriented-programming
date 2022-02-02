package CheckpointII;

import java.util.ArrayList;

public class Banco {
//    Attributes
    private String nome;
    private String agencia;
    private String endereco;
    private String telefone;
    private String[] tiposContas = new String[2];
    private ArrayList<PessoaFisica> listaClientesPF = new ArrayList<>();
    private ArrayList<PessoaJuridica> listaClientesPJ = new ArrayList<>();

//    Constructor
    public Banco(String nome, String agencia, String endereco, String telefone) {
        this.nome = nome;
        this.agencia = agencia;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void listarTiposContas(){
        this.tiposContas[0] = "Poupança";
        this.tiposContas[1] = "Conta Corrente";

        for (int i = 0; i < this.tiposContas.length; i++) {
            System.out.println("O Banco possui tipo de conta " + this.tiposContas[i]);
        }
    }

    public void adicionarClientePF(PessoaFisica cliente){
        listaClientesPF.add(cliente);
    }

    public void adicionarClientePJ(PessoaJuridica cliente){
        listaClientesPJ.add(cliente);
    }

    public void listarClientesPF(){
        System.out.println(this.listaClientesPF.toString());
    }

    public void listarClientesPJ(){
        System.out.println(this.listaClientesPJ.toString());
    }

    @Override
    public String toString(){
        return "\n";
    }


}
