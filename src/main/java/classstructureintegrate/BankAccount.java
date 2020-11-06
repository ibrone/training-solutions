package classstructureintegrate;

public class BankAccount {

    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public BankAccount (int balance){
        this.balance = balance;
    }

    public void transfer (BankAccount targetBankAccount, int amount){
balance = balance - amount;
    targetBankAccount.setBalance(targetBankAccount.getBalance() + amount  );}
}
