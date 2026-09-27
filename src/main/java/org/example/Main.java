package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccountManager actMgr = new AccountManager(new SbiBankAccount());
        actMgr.depositeAmount(112233, 1000);
        actMgr.showBalance();
        actMgr.depositeAmountWithName(112233, 500, "NextByte");
        actMgr.showBalance();

        SbiBankAccount sbiBankAccount = new SbiBankAccount();
        sbiBankAccount.balanceAmount = 10000;
        sbiBankAccount.showBalance();
    }
}