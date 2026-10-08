package org.nextbyte;

import org.nextbyte.dto.RbiBankAccountDto;
import org.nextbyte.service.SbiBankAccountService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AccountManager actMgr = new AccountManager(new SbiBankAccountService());
        RbiBankAccountDto accountDto1 = new RbiBankAccountDto();
        accountDto1.setAccountHolderName("Abc");
        accountDto1.setAccountNumber(55555);
        accountDto1.setBalance(2000);
        accountDto1.setContactNumber(123456789);

        RbiBankAccountDto accountDto2 = new RbiBankAccountDto();
        accountDto2.setAccountHolderName("Xyz");
        accountDto2.setAccountNumber(11111);
        accountDto2.setBalance(3400);
        accountDto2.setContactNumber(444444444);

        actMgr.isDuplicate(accountDto1, accountDto2);

        System.out.println(accountDto1 == accountDto2);
        RbiBankAccountDto testAccount = accountDto1;
        System.out.println(testAccount == accountDto1);
        System.out.println(testAccount == accountDto2);

        RbiBankAccountDto accountDto3 = new RbiBankAccountDto();
        accountDto3.setAccountHolderName("Xyz");
        accountDto3.setAccountNumber(11111);
        accountDto3.setBalance(3400);
        accountDto3.setContactNumber(444444444);

        actMgr.isDuplicate(accountDto2, accountDto3);



        //actMgr.depositeAmount(2500, accountDto1 );
//        actMgr.showBalance();
//        actMgr.depositeAmountWithName(112233, 500, "NextByte");
//        actMgr.showBalance();
//
//        SbiBankAccountService sbiBankAccount = new SbiBankAccountService();
//        sbiBankAccount.showBalance();
    }
}