package Aula14.PortoBuenosAires;

import java.util.ArrayList;
import java.util.Collections;

public class SistemaPorto {
//    Attributes
    private String cidade;
    private ArrayList<Container> listaContainer = new ArrayList<>();

//    Constructor
    public SistemaPorto(String cidade) {
        this.cidade = cidade;
    }

//    Methods
    public void entrada(Container container) {
        listaContainer.add(container);
    };

    public void mostrarContainer() {
        Collections.sort(listaContainer);
        System.out.println("Container");
        for (Container container: listaContainer) {
            System.out.println("ID: " + container.getId() + " Descrição: " + container.getDescription() +
                    " Origem: " + container.getOrigem() + " Material perigoso: " + container.isPerigoso());
        }
    };

    public int quantidadeContainerPerigoso() {
        int contador = 0;
        for (Container container: listaContainer) {
            if (container.isPerigoso() && container.getOrigem().equals("Desconhecido"))
                contador++;
        }
        return contador;
    };
}
