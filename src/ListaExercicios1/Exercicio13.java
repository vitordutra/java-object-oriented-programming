package ListaExercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String frase = entrada.nextLine();

        String vogais = "aeiou";
        int contE = 0, contV = 0;

        for (int i = 0; i<frase.length(); i++){
            if (frase.charAt(i) == ' '){
                contE++;
            }else{
                for (int n = 0; n<vogais.length(); n++) {
                    if (frase.charAt(i) == vogais.charAt(n)){
                        contV++;
                    }

                }
            }

        }

        System.out.println("Na frase teve " + contE + " espaço(s) e " + contV + " vogal/vogais");

    }
}
