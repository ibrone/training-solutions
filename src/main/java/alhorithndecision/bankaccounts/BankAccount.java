package alhorithndecision.bankaccounts;

import java.util.Scanner;

public class BankAccount {

    private String nameOfOwner;
    private int accountNumber;
    private int balance;

    public BankAccount(String nameOfOwner, int accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw (int withdraw){
        if (withdraw< balance){
            balance = balance - withdraw;
        }
        else throw new IllegalArgumentException("Nem lehet levonni a számláról ennyi pénzt, az egyenleg:" + getBalance());
    }
    public boolean deposit(int amount) {
        balance += amount;
        return true;

    }

}
