package CheckpointII;

public class Main {

        public static void main (String[] args){
            Banco banco = new Banco("Banco1", "002", "rua 1", "2222-2222");
            banco.listarTiposContas();

            // Criando Clientes Pessoa Fisica
            PessoaFisica cliente1 = new PessoaFisica("Diego", "Rua X, 21", "3228-4661", "000.111.222-33");
            PessoaFisica cliente2 = new PessoaFisica("Alexandre", "Rua Y,22", "2222-4444", "022.007.333-90");

            // Criando clientes Pessoa Juridica
            PessoaJuridica cliente4 = new PessoaJuridica("Die", "Rua 2", "2222-2222", "02209.339.936/0001-16", "Decrescenzo");
            PessoaJuridica cliente5 = new PessoaJuridica("Ale", "Rua 14", "3333-3333", "13.217.485/0001-11", "DANI");

            // Adicionando os Clientes Pessoa Fisica a lista de clientes do Banco
            banco.adicionarClientePF(cliente1);
            banco.adicionarClientePF(cliente2);


            // Adicionando Clientes Pessoa Juridica a lista de clientes do Banco
            banco.adicionarClientePJ(cliente4);
            banco.adicionarClientePJ(cliente5);

            // Listando os clientes existente na lista do Banco
            banco.listarClientesPF();
            banco.listarClientesPJ();

        }

}
