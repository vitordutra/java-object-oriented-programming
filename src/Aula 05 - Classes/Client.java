package Aula05;

public class Client {

//    Attributes
    private int clientNum;
    private String name;
    private double debt;

//    Class constructor
    public Client(int number, String name) {
//        Initializing class attributes
        this.clientNum = number;
        this.name = name;
        this.debt = 0;
    }

//    Create Get/Set Methods (For Private Attributes)
//    Attribute: name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    Attribute: clientNum
    public int getClientNum() {
        return this.clientNum;
    }

    public void setName(int clientNum) {
        this.clientNum = clientNum;
    }

    //    Attribute: debt
    public double getDebt() {
        return this.debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

//    Methods
    public void increaseDebt(double value) {
        this.debt += value;
        System.out.println("Sua dívida agora é de: " + this.debt);
    }

    public void quitDebt(double value) {
        if ((this.debt == 0)) {
            System.out.println("Você não tem dívida!");
        } else {
            this.debt -= value;
        }
    }

}
