package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class DepositTrasaction extends BaseTransaction {
    public DepositTrasaction(int amount, @NotNull Calendar date){
        super(amount, date);
    }
    private boolean checkDepositAmount(int amt){
        return amt >= 0;
    }

    // Method to print a transaction receipt or details
    public void printTransactionDetails(){
        System.out.println("Withdrawal Transaction: "+this.toString());
    }

   @Override
   public void apply(BankAccount ba){
        double curr_balance = ba.getBalance();
        double new_balance = curr_balance + getAmount();
        ba.setBalance(new_balance);
       System.out.println("Deposit applied. New balance: " + new_balance);
    }
}
