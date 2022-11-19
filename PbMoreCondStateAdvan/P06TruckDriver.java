package PbMoreCondStateAdvan;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String season = scan.nextLine();
        double km = Double.parseDouble(scan.nextLine());

        double salary = 0;

        if (km <= 5000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                salary = km * 0.75;
            } else if (season.equals("Summer")) {
                salary = km * 0.90;
            } else if (season.equals("Winter")) {
                salary = km * 1.05;
            }
        } else if (km <= 10000) {
            if (season.equals("Spring") || season.equals("Autumn")) {
                salary = km * 0.95;
            } else if (season.equals("Summer")) {
                salary = km * 1.10;
            } else if (season.equals("Winter")) {
                salary = km * 1.25;
            }
        } else if (km <= 20000) {
            salary = km * 1.45;
        }
        salary=salary*4*0.90;
        System.out.printf("%.2f", salary);
    }
}
