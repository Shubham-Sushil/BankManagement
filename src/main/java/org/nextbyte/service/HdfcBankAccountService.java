package org.nextbyte.service;

import org.nextbyte.dto.RbiBankAccountDto;

public class HdfcBankAccountService extends RbiBankAccountServiceImpl {

    @Override
    public boolean deposite(int depositeAmount, RbiBankAccountDto bankAccountDto) {
        super.deposite(depositeAmount, bankAccountDto);
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
