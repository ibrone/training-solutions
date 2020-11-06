package classstructureintegrate;

public class BankAccountMain {
    public static void main(String[] args) {

    BankAccount john = new BankAccount(1000);
    BankAccount jack = new BankAccount(1000);

    john.transfer(jack,500);

        System.out.println(john.getBalance());
        System.out.println(jack.getBalance());


    }




}
