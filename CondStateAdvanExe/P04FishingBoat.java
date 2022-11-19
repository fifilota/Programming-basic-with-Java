package CondStateAdvanExe;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int fisherman = Integer.parseInt(scan.nextLine());

        double totalPrice = 0;

        switch (season){
            case "Spring":
                totalPrice=3000;
                if (fisherman<=6){
                    totalPrice=totalPrice*0.90;
                } else if (fisherman<=11) {
                    totalPrice=totalPrice*0.85;
                }else {
                    totalPrice=totalPrice*0.75;
                }
                break;
            case "Summer":
                totalPrice=4200;
                if (fisherman<=6){
                    totalPrice=totalPrice*0.90;
                } else if (fisherman<=11) {
                    totalPrice=totalPrice*0.85;
                }else {
                    totalPrice=totalPrice*0.75;
                }
                break;
            case "Autumn":
                totalPrice=4200;
                if (fisherman<=6){
                    totalPrice=totalPrice*0.90;
                } else if (fisherman<=11) {
                    totalPrice=totalPrice*0.85;
                }else {
                    totalPrice=totalPrice*0.75;
                }
                break;
            case "Winter":
                totalPrice=2600;
                if (fisherman<=6){
                    totalPrice=totalPrice*0.90;
                } else if (fisherman<=11) {
                    totalPrice=totalPrice*0.85;
                }else {
                    totalPrice=totalPrice*0.75;
                }
                break;
        }
        if (fisherman%2==0){
            if (season.equals("Spring")||season.equals("Summer")||season.equals("Winter")){
                totalPrice=totalPrice*0.95;
            }
        }
        if (budget>=totalPrice){
            System.out.printf("Yes! You have %.2f leva left.",budget-totalPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",totalPrice-budget);
        }
    }
}
