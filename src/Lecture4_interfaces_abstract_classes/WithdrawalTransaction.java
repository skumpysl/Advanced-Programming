package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class WithdrawalTransaction extends BaseTransaction {
    private final double originalBalance;
    public WithdrawalTransaction(int amount, @NotNull Calendar date, double originalBalance)
    {
        super(amount, date);
        this.originalBalance = originalBalance;
    }

    private boolean checkDepositAmount(int amt) {
        return amt >= 0;
    }

    // Method to print a transaction receipt or details
    public void printTransactionDetails() {
        System.out.println("Deposit Transaction: " + this.toString());
    }

    /*
    Opportunity for assignment: implementing different form of withdrawal
     */

    @Override
    public void apply(BankAccount ba) {
        double curr_balance = ba.getBalance();
        if (curr_balance > getAmount()) {
            double new_balance = curr_balance - getAmount();
            ba.setBalance(new_balance);
            System.out.println("Withdrawal applied. New balance: " + new_balance);
        }
        else
            { System.out.println("Insufficient funds for withdrawal."); }
        }

        public boolean reverse(BankAccount ba) {
            ba.setBalance(originalBalance);
            System.out.println("Withdrawal reversed. Balance restored to: " + originalBalance);
            return true;
        }
    }
    /*
    Assignment 1 Q3: Write the Reverse method - a method unique to the WithdrawalTransaction Class
     */


