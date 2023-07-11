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
        if (value > 0) { // If the value you want to add tot the balance is greater than zero
            balance += value; // Adding the value to the balance
            System.out.println("Your balance has been filled with " + value + " currency");
        }
        else System.out.println("This operation is denied!"); // Give the massage that the operation can't be done
    }
    public void withdrawFromBal(int value) {
        if (value <= balance && value > 0) { // If value you want to withdraw from the balance is greater than zero
            // and smaller or equal to the balance's value
            balance -= value;
            System.out.println("The amount of " + value + " currency has been withdrawn from your balance");
        }
        else System.out.println("This operation is denied!");
    }
    private String generateBankAcc() {
        var rand = new Random(); // Initializing randomizer
        String someStr = null; // And also about string
        for (int i = 0; i < 8; i++) {
            someStr += rand.nextInt(10); // Adding the number from 0 to 10 to the string
        }
        return someStr;
    }
}
