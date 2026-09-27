package org.example;

public interface RbiBankAccount {

    boolean deposite(int actNo, int depositeAmount);

    boolean deposite(int actNo, int depositeAmount, String accountHolderName);

    boolean withdraw(int actNo, int withdrawAmount);

    void showBalance();

    void processLoan();

    void showInterestRate();

}
