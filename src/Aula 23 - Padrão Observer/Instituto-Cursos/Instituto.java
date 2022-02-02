package Aula23;

import java.util.ArrayList;

public class Instituto {
    //    Singleton pattern
    private static Instituto instance;

    private Instituto() {
    }

    protected ArrayList<Ofertas> ofertaLista = new ArrayList<>();

    public static Instituto getInstance() {
        if (instance == null)
            instance = new Instituto();
        return instance;
    }


    public void addOferta(Ofertas o) {
        this.ofertaLista.add(o);
    }


    public void gerarRelatorio() {
        System.out.println("RELATÓRIO: ");
        for(Ofertas o: ofertaLista){
            System.out.println(String.format("\nOferta: %s. \nDescricao: %s. \nValor: R$ %.2f", o.getNome(), o.getDescricao(), o.calcularPreco()));
        }

    }

    @Override
    public String toString() {
        return "Instituto{" +
                "ofertaLista=" + ofertaLista +
                '}';
    }
}
