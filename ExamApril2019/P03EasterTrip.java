package ExamApril2019;

import java.util.Scanner;

public class P03EasterTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();
        String period = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double nightPrice=0;

        switch (destination){
            case "France":
                if (period.equals("21-23")){
                    nightPrice=30;
                } else if (period.equals("24-27")) {
                    nightPrice=35;
                } else if (period.equals("28-31")) {
                    nightPrice=40;
                }
                break;
            case "Italy":
                if (period.equals("21-23")){
                    nightPrice=28;
                } else if (period.equals("24-27")) {
                    nightPrice=32;
                } else if (period.equals("28-31")) {
                    nightPrice=39;
                }
                break;
            case "Germany":
                if (period.equals("21-23")){
                    nightPrice=32;
                } else if (period.equals("24-27")) {
                    nightPrice=37;
                } else if (period.equals("28-31")) {
                    nightPrice=43;
                }
                break;
        }
        double tripPrice = nights*nightPrice;

        System.out.printf("Easter trip to %s : %.2f leva.",destination,tripPrice);
    }
}
