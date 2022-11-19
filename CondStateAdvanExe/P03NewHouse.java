package CondStateAdvanExe;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flourType = scan.nextLine();
        int flourCount = Integer.parseInt(scan.nextLine());
        int budget = Integer.parseInt(scan.nextLine());

        double flourPrice = 0;
        double totalPrice = 0;

        switch (flourType){
            case "Roses":
                flourPrice=5.00;
                totalPrice=flourCount*flourPrice;
                if (flourCount>80){
                    totalPrice=totalPrice*0.90;
                }
                break;
            case "Dahlias":
                flourPrice=3.80;
                totalPrice=flourCount*flourPrice;
                if (flourCount>90){
                    totalPrice=totalPrice*0.85;
                }
                break;
            case "Tulips":
                flourPrice=2.80;
                totalPrice=flourCount*flourPrice;
                if (flourCount>80){
                    totalPrice=totalPrice*0.85;
                }
                break;
            case "Narcissus":
                flourPrice=3.00;
                totalPrice=flourCount*flourPrice;
                if (flourCount<120){
                    totalPrice=totalPrice*1.15;
                }
                break;
            case "Gladiolus":
                flourPrice=2.50;
                totalPrice=flourCount*flourPrice;
                if (flourCount<80){
                    totalPrice=totalPrice*1.20;
                }
                break;
        }

        if (budget>=totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flourCount, flourType,budget-totalPrice);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", totalPrice-budget);
        }



    }
}
