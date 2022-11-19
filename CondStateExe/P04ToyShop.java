package CondStateExe;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int teddyBears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());
        int totalToys = puzzles+dolls+teddyBears+minions+trucks;
        double profit = puzzles * 2.60 + dolls * 3 + teddyBears * 4.10 + minions * 8.20 + trucks * 2;

        if (totalToys>=50){
            profit=profit*0.75;
        }

        double finalProfit = profit*0.90;

        if (finalProfit>=holidayPrice){
            double diff = finalProfit-holidayPrice;
            System.out.printf("Yes! %.2f lv left.", diff);
        }else {
            double diff = holidayPrice-finalProfit;
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}
