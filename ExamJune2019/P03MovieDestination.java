package ExamJune2019;

import java.util.Scanner;

public class P03MovieDestination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String destination = scan.nextLine();
        String season = scan.nextLine();
        int days = Integer.parseInt(scan.nextLine());

        double price =0;

        switch (destination){
            case "Dubai":
                if (season.equals("Winter")){
                    price=45000*days;
                }else {
                    price=40000*days;
                }
                price*=0.70;
                break;
            case "Sofia":
                if (season.equals("Winter")){
                    price=17000*days;
                }else {
                    price=12500*days;
                }
                price*=1.25;
                break;
            case "London":
                if (season.equals("Winter")){
                    price=24000*days;
                }else {
                    price=20250*days;
                }
                break;
        }
        if (budget>=price){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",budget-price);
        }else {
            System.out.printf("The director needs %.2f leva more!",price-budget);
        }
    }
}
