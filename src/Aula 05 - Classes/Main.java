package Aula05;

public class Main {
    public static void main(String[] args) {

        Client client = new Client(123, "Diego");
        System.out.println(client.getName());
        client.increaseDebt(100);
        client.quitDebt(10);
        System.out.println(client.getDebt());
        System.out.println("==========================");
    }
}
