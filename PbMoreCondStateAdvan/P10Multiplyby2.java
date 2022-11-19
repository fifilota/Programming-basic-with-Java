package PbMoreCondStateAdvan;

import java.util.Scanner;

public class P10Multiplyby2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = Double.parseDouble(scan.nextLine());


        while (input == Math.abs(input)) {
            double result = 0;
            double currentNum = input;
            result = currentNum * 2;
            System.out.printf("Result: %.2f%n", result);

            input = Double.parseDouble(scan.nextLine());

        }
        if (input != Math.abs(input)) {
            System.out.println("Negative number!");
        }
    }
}
