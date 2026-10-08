package org.nextbyte.service;

import org.nextbyte.dto.RbiBankAccountDto;

public class SbiBankAccountService extends RbiBankAccountServiceImpl {

    @Override
    public boolean deposite(int depositeAmount, RbiBankAccountDto bankAccountDto) {
        super.deposite(depositeAmount, bankAccountDto);
        System.out.println("Amount deposited in SBI");
        return true;
    }

    @Override
    public boolean deposite(int actNo, int depositeAmount, String accountHolderName) {
        super.deposite(actNo, depositeAmount, accountHolderName);
        System.out.println("Amount deposited in SBI");
        return true;
    }

    @Override
    public void processLoan() {
        System.out.println("Processing Sbi Loan");
    }

    @Override
    public void showInterestRate() {
        System.out.println("Sbi Interest rate is - 8%");
    }
}
