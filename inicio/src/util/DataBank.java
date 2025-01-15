package util;

public class DataBank {

   private String name;
   private int number;
   private double balance;

    public DataBank(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public DataBank(String name, int number, double initialDeposit) {
        this.name = name;
        this.number = number;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

   public void withdraw(double amount) {
        balance -= amount + 5.0;
   }

   public String toString() {
        return  "Account: "
                + number
                + ", holder: "
                + name
                + ", Balance: $"
                + String.format("%.2f", balance);
   }

}
