package CondStateExe;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        int statists = Integer.parseInt(scan.nextLine());
        double statistDress = Double.parseDouble(scan.nextLine());
        double decor = budget * 0.10;
        double statsPrice = statists*statistDress;
        if (statists > 150) {
            statsPrice = statsPrice * 0.90;
        }
        double sum = statsPrice+ decor;

        if (sum > budget) {
            double diff = sum - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else if (sum <= budget) {
            double diff = budget - sum;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }

    }
}
