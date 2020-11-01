package classtructureio;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello");
        System.out.println("add meg az első számot:");
        int number1 = scanner.nextInt();

        System.out.println("add meg a második számot:");
        int number2 = scanner.nextInt();
        System.out.println(number1 + " + " + number2);
        System.out.println(number1 + number2);
    }



}
