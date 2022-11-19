package CondStateAdvanExe;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projectionType = scan.nextLine();
        int rows = Integer.parseInt(scan.nextLine());
        int columns = Integer.parseInt(scan.nextLine());

        int fullHall = rows*columns;
        double ticketPrice = 0;

        switch (projectionType){
            case "Premiere":
                ticketPrice=12.00;
                break;
            case "Normal":
                ticketPrice=7.50;
                break;
            case "Discount":
                ticketPrice=5.00;
                break;
        }
        double totalPrice = fullHall*ticketPrice;
        System.out.printf("%.2f", totalPrice);

    }
}
