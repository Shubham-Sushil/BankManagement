package org.example;

public class HdfcBankAccount extends RbiBankAccountImpl{

    @Override
    public boolean deposite(int actNo, int depositeAmount) {
        super.deposite(actNo, depositeAmount);
        System.out.println("Amount deposited in HDFC");
        return true;
    }

    @Override
    public boolean deposite(int actNo, int depositeAmount, String accountHolderName) {
        super.deposite(actNo, depositeAmount, accountHolderName);
        System.out.println("Amount deposited in HDFC");
        return true;
    }

    @Override
    public void processLoan() {
        System.out.println("Processing Hdfc Loan");
    }

    @Override
    public void showInterestRate() {
        System.out.println("HDFC Interest rate is - 10%");
    }
}
