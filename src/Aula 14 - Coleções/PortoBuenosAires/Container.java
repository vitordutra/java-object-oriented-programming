package Aula14.PortoBuenosAires;

/* O porto de Buenos Aires precisa administrar os contêineres que entram no dia a dia.
Estes possuem um número que os identifica, uma descrição, o país de origem
(China, EUA, Brasil, Rússia, Canadá, Desconhecido) e uma marca que indica
se está transportando materiais perigosos.
O sistema deve permitir ao porto a entrada de contêineres, mostrá-los ordenados de acordo com
o número que os identifica e poder calcular a quantidade de contêineres perigosos de origem "Desconhecida".
 */

import Aula14.Equipe.Jogador;

public class Container implements Comparable<Container> {
//    Attributes
    private int id;
    private String description;
    private String origem;
    private boolean perigoso;

//    Constructor
    public Container(int id, String description, String origem, boolean perigoso) {
        this.id = id;
        this.description = description;
        this.origem = origem;
        this.perigoso = perigoso;
    }

//    Getters/Setters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getOrigem() {
        return origem;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    //    Methods
    @Override
    public int compareTo(Container container) {
        if (container.id == getId())
            return 0;
        else if (container.id < getId())
            return 1;
        else
            return -1;
    }
}
