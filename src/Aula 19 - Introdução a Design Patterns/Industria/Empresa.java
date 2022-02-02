package Aula19.Industria;

import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    private ArrayList<Empregado> listaEmpregado = new ArrayList<>();

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public double calcularSalarioTotal(int dias){
        double total = 0;
        for (Empregado empregado : listaEmpregado) {
            total += empregado.calcularSalario(dias);
        }
        return total;
    }

    public void addEmpregado(Empregado empregado){
        listaEmpregado.add(empregado);
    }
}
