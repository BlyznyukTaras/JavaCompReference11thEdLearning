package src.ExamplePrograms.TaskClasses.MediumClasses;

import java.util.Random;

public class BankAccount {
    private String bankAcc;
    private String owner;
    private int balance;
    public BankAccount(String owner) {
        this.owner = owner;
        bankAcc = generateBankAcc();
        balance = 0;
    }
    public void outputInfo() {
        System.out.println("Bank account's ID: " + bankAcc + ", " +
                "owner: " + owner + ", balance: " + balance + " currency");
    }
    public void addToBal(int value) {
        if (value > 0) {
            balance += value;
            System.out.println("Your balance has been filled with " + value + " currency");
        }
        else System.out.println("This operation is denied!");
    }
    public void withdrawFromBal(int value) {
        if (value < balance && value > 0) {
            balance -= value;
            System.out.println("The amount of " + value + " currency has been withdrawn from your balance");
        }
        else System.out.println("This operation is denied!");
    }
    private String generateBankAcc() {
        var rand = new Random();
        String someStr = "";
        for (int i = 0; i < 8; i++) {
            someStr += rand.nextInt(10);
        }
        return someStr;
    }
}
