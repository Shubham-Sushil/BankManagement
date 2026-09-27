package org.example;

public abstract class RbiBankAccountImpl implements RbiBankAccount {

    String accountHolderName;
    int accountNumber;
    int balanceAmount;


    @Override
    public boolean deposite(int actNo, int depositeAmount) {
        System.out.println("Depositing Amount for actno - " + actNo + " and amout is - " + depositeAmount);
        balanceAmount = balanceAmount + depositeAmount;
        return true;
    }

    @Override
    public boolean deposite(int actNo, int depositeAmount, String accountHolderName) {
        System.out.println("Depositing Amount for actno - " + actNo + " and amout is - " + depositeAmount + " AccountHOlder Name - " + accountHolderName);
        balanceAmount = balanceAmount + depositeAmount;
        return true;
    }

    @Override
    public boolean withdraw(int actNo, int withdrawAmount) {
        System.out.println("Withdraw amount - " + withdrawAmount);
        if (balanceAmount < withdrawAmount){
            System.out.println("Balance low");
            return false;
        }
        balanceAmount = balanceAmount - withdrawAmount;
        return true;
    }

    @Override
    public void showBalance() {
        System.out.println("Your balance is - " + balanceAmount);
    }

    public abstract void processLoan();

}
