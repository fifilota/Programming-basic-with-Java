package ExamMay2019;

import java.util.Scanner;

public class P02Safari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double fuelNeeded = Double.parseDouble(scan.nextLine()); // in litres
        String day = scan.nextLine();

        double fuelPrice = fuelNeeded*2.10;
        double sum = fuelPrice+100;

        if (day.equals("Saturday")){
            sum*=0.90;
        } else if (day.equals("Sunday")) {
            sum*=0.80;
        }
        if (budget>=sum){
            System.out.printf("Safari time! Money left: %.2f lv.",budget-sum);
        }else {
            System.out.printf("Not enough money! Money needed: %.2f lv.",sum-budget);
        }
    }
}
