package PbMoreCondStateAdvan;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String ticket = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        double transport = 0;
        double price = 0;

        switch (ticket) {
            case "VIP":
                price = n * 499.99;
                break;
            case "Normal":
                price = n * 249.99;
                break;
        }
        if (n<=4){
            transport=budget*0.75;
        } else if (n<=9) {
            transport=budget*0.60;
        } else if (n<=24) {
            transport=budget*0.50;
        } else if (n<=49) {
            transport= budget*0.40;
        }else {
            transport=budget*0.25;
        }
        double freeMoney = budget-transport;

        if (freeMoney>=price){
            System.out.printf("Yes! You have %.2f leva left.", freeMoney-price);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", price-freeMoney);
        }
    }
}
