package org.nextbyte.service;

import org.nextbyte.dto.RbiBankAccountDto;

public interface RbiBankAccountService {

    boolean deposite(int depositeAmount, RbiBankAccountDto bankAccountDto);

    boolean deposite(int actNo, int depositeAmount, String accountHolderName);

    boolean withdraw(int actNo, int withdrawAmount);

    void showBalance();

    void processLoan();

    void showInterestRate();

}
