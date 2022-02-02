package ListaExercicios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int cont = -1;
        while (cont!=0){
            System.out.println("Digite seu usuário");
            String usuario = entrada.nextLine();

            System.out.println("Digite sua senha");
            String senha = entrada.nextLine();

            if (!usuario.equals(senha)){
                cont = 0;
                System.out.println("Login efetuado com sucesso!!");
            }else{
                System.out.println("A senha não pode ser igual ao usuário!");
            }
        }
    }
}
