package org.nextbyte.service;

import org.nextbyte.dto.RbiBankAccountDto;

public abstract class RbiBankAccountServiceImpl implements RbiBankAccountService {


    @Override
    public boolean deposite(int depositeAmount, RbiBankAccountDto bankAccountDto) {
        System.out.println("Depositing Amount for actno - " + bankAccountDto.getAccountNumber() + " and amout is - " + depositeAmount);
        return true;
    }

    @Override
    public boolean deposite(int actNo, int depositeAmount, String accountHolderName) {
        System.out.println("Depositing Amount for actno - " + actNo + " and amout is - " + depositeAmount + " AccountHOlder Name - " + accountHolderName);
        return true;
    }

    @Override
    public boolean withdraw(int actNo, int withdrawAmount) {
        System.out.println("Withdraw amount - " + withdrawAmount);
        return true;
    }

    @Override
    public void showBalance() {
        System.out.println("Your balance is - ");
    }

    public abstract void processLoan();

}
