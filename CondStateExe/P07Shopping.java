package CondStateExe;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget =Double.parseDouble(scan.nextLine());
        int n =Integer.parseInt(scan.nextLine());
        int m =Integer.parseInt(scan.nextLine());
        int p =Integer.parseInt(scan.nextLine());

        double nSum = n*250;
        double mSum=m*(nSum*0.35);
        double pSum =p*(nSum*0.10);
        double allSum = nSum+mSum+pSum;

        if (n>m){
            allSum=allSum*0.85;
        }

        if (budget>=allSum){
            System.out.printf("You have %.2f leva left!", budget-allSum);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", allSum-budget);
        }


    }
}
