package CondStateAdvanExe;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        double totalPrice= 0;
        String destination ="";
        String accommodation ="";

        if (budget<=100){
            destination = "Bulgaria";
            if (season.equals("summer")){
                totalPrice=budget*0.30;
                accommodation="Camp";
            }else {
                totalPrice=budget*0.70;
                accommodation="Hotel";
            }

        } else if (budget<=1000) {
            destination="Balkans";
            if (season.equals("summer")){
                totalPrice=budget*0.40;
                accommodation="Camp";
            }else {
                totalPrice=budget*0.80;
                accommodation="Hotel";
            }
            
        } else {
            destination="Europe";
            totalPrice=budget*0.90;
            accommodation="Hotel";

            }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",accommodation,totalPrice);
        }
    }

