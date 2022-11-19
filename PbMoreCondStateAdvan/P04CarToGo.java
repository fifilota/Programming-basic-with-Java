package PbMoreCondStateAdvan;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String classs = "";
        String car = "";
        double price = 0;

        if (budget <= 100) {
            classs = "Economy class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                price = budget * 0.35;
            } else {
                car = "Jeep";
                price = budget * 0.65;
            }
        } else if (budget <= 500) {
            classs = "Compact class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                price = budget * 0.45;
            } else {
                car = "Jeep";
                price = budget*0.80;
            }
        } else {
            classs = "Luxury class";
            car="Jeep";
            price=budget*0.90;
        }
        System.out.println(classs);
        System.out.printf("%s - %.2f", car, price);
    }
}
