package org.nextbyte.dto;

import java.util.Objects;

public class RbiBankAccountDto {

    private String accountHolderName;
    private int accountNumber;
    private int balance;
    private long contactNumber;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public boolean equals(Object o) {
        RbiBankAccountDto that = (RbiBankAccountDto) o;
        if(this.accountNumber == that.accountNumber && this.balance == that.balance && this.contactNumber == that.contactNumber){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountHolderName, accountNumber, balance, contactNumber);
    }
}
