package org.nextbyte;

import org.nextbyte.dto.RbiBankAccountDto;
import org.nextbyte.service.RbiBankAccountService;

public class AccountManager {

    //private SbiBankAccount sbiBankAccount = new SbiBankAccount();
    //private HdfcBankAccount hdfcBankAccount = new HdfcBankAccount();
    private RbiBankAccountService bankAccount;

    public AccountManager(RbiBankAccountService bankAccount) {
        this.bankAccount = bankAccount;
    }


    public void depositeAmount(int depositeAmount, RbiBankAccountDto rbiBankAccountDto){
        bankAccount.deposite(depositeAmount, rbiBankAccountDto);
    }

    public void depositeAmountWithName(int actNo, int depositeAmount, String name){
        bankAccount.deposite(actNo, depositeAmount, name);
    }

    public void showBalance(){
        bankAccount.showBalance();
    }

    public boolean isDuplicate(RbiBankAccountDto arg, RbiBankAccountDto var){
        boolean isDuplicate = arg.equals(var);
        if(isDuplicate == true){
            System.out.println("Given Account Objects are duplicate");
        }else{
            System.out.println("Not Duplicate");
        }
        return isDuplicate;
    }

}
