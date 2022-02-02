package ListaExercicios2.Exercicio3Ingresso;

public class CamaroteInferior extends VIP {
//    Atributte
    private int localizacao;

//    Constructor
    public CamaroteInferior(float valor, float valorAdicional) {
        super(valor, valorAdicional);
        this.localizacao = 2;
    }

//    Getter/Setter
    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

//    Methods
    public void imprimirLocalizacao() {
        System.out.println(this.localizacao == 1 ? "Camarote superior": "Camarote inferior");
    }
}
