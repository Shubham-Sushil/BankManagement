package org.example;

public class AccountManager {

    //private SbiBankAccount sbiBankAccount = new SbiBankAccount();
    //private HdfcBankAccount hdfcBankAccount = new HdfcBankAccount();
    private RbiBankAccount bankAccount;

    public AccountManager(RbiBankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    public void depositeAmount(int actNo, int depositeAmount){
        bankAccount.deposite(actNo, depositeAmount);
    }

    public void depositeAmountWithName(int actNo, int depositeAmount, String name){
        bankAccount.deposite(actNo, depositeAmount, name);
    }

    public void showBalance(){
        bankAccount.showBalance();
    }

}
