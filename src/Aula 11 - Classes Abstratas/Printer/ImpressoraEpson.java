package Aula11.Printer;

import Aula11.Printer.Impressora;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora {

//    Constructor
    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis,
                           double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

//    Method
    @Override
    public String imprimir() {
        if (temPapel() && !precisaTinta()) {
            setFolhasDisponiveis(getFolhasDisponiveis() - 1);
            setPorcentagemTinta(getPorcentagemTinta() - 0.01);
            return "Imprimir";
        }
        else if (temPapel() && precisaTinta()) return "Você precisa adicionar tinta";
        else if (!temPapel() && precisaTinta()) return "Você precisa de tinta e não tem papel";
        else return "Você não tem papel!";
    }
}
