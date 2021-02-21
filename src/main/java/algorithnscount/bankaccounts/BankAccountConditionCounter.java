package algorithnscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {


    public int BankAccountMin (List<BankAccount> accounts, int min) {
        int sum = 0;
        for (BankAccount account: accounts) {
            if(BankAccount.getBalance()> min){
                sum++;
            }
        }
            return sum;


    }
}
