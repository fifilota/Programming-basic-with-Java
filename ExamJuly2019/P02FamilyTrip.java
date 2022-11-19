package ExamJuly2019;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        double price1night = Double.parseDouble(scan.nextLine());
        int addCosts = Integer.parseInt(scan.nextLine()); // percent
        if (nights>7) {
            price1night *= 0.95;
        }
        double sum = nights*price1night+budget*addCosts/100;

        if (sum<=budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget-sum);
        }else {
            System.out.printf("%.2f leva needed.",sum-budget);
        }


    }
}
