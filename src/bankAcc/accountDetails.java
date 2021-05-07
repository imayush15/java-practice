package bankAcc;

public class accountDetails {

    // Properties of Bank Account
    private String name;
    private String country;
    private int age;
    private int balance;
    private String ID;

    public accountDetails(String Name, String Country, int Age, int Balance, String ID) {
        this.name = Name;
        this.country = Country;
        this.age = Age;
        this.balance = Balance;
        this.ID = ID;
    }

    // Behaviours
    public String getName() {

        return name;
    }
    public int getBalance() {
        return balance;
    }

    public int newDeposit(int deposit) {
        return balance+deposit;
    }

}
