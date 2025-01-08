package question1;

import Lecture4_interfaces_abstract_classes.BankAccount;
import Lecture4_interfaces_abstract_classes.TransactionInterface;
import org.jetbrains.annotations.NotNull;


import java.util.Calendar;
import java.util.UUID;

public class BaseTransaction implements TransactionInterface {
    private final double amount;
    private final Calendar date;
    private final String transactionID;

    public BaseTransaction(double amount, @NotNull Calendar date) {
        this.amount = amount;
        this.date = date;
        this.transactionID = UUID.randomUUID().toString();
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public Calendar getDate() {
        return date;
    }

    @Override
    public String getTransactionID() {
        return transactionID;
    }

    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: " + amount);
        System.out.println("Date: " + date.getTime());
    }

    public void apply(BankAccount ba) {
        // Default implementation (can be overridden by subclasses)
        System.out.println("Applying transaction to bank account.");
    }
}
