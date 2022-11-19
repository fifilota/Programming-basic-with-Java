package PbMoreCondStateAdvan;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String location = "";
        String accommodation = "";
        double price = 0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if (season.equals("Summer")){
                location="Alaska";
                price=budget*0.65;
            }else {
                location="Morocco";
                price=budget*0.45;
            }

        } else if (budget <= 3000) {
            accommodation = "Hut";
            if (season.equals("Summer")){
                location="Alaska";
                price=budget*0.80;
            }else {
                location="Morocco";
                price=budget*0.60;
            }
        } else {
            accommodation = "Hotel";
            if (season.equals("Summer")){
                location="Alaska";
                price=budget*0.90;
            }else {
                location="Morocco";
                price=budget*0.90;
            }
        }

        System.out.printf("%s - %s - %.2f", location, accommodation, price);
    }
}
