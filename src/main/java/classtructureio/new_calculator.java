package classtructureio;


import java.util.Scanner;

public class new_calculator {

    private int a;
    private int b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi az első összeadandó szám?");
        int a = scanner.nextInt();
        System.out.println("Mi a második összeadandó szám?");
        int b = scanner.nextInt();
        System.out.println("A művelet: " + a + " + " + b );
        System.out.println(a+b);



    }

}
