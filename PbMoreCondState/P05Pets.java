package PbMoreCondState;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int kgFood = Integer.parseInt(scan.nextLine());
        double dogFoodDay = Double.parseDouble(scan.nextLine()); // in kg
        double catFoodDay = Double.parseDouble(scan.nextLine()); // in kg
        double turtleFoodDay = Double.parseDouble(scan.nextLine()); // IN GRAMS!!!

        double dogFoodNeeded = dogFoodDay*days;
        double catFoodNeeded = catFoodDay*days;
        double turtleFoodNeeded = turtleFoodDay*days*0.001;
        double allFoodNeeded = dogFoodNeeded+catFoodNeeded+turtleFoodNeeded;

        if (kgFood>=allFoodNeeded){
            double diff = Math.floor(kgFood-allFoodNeeded);
            System.out.printf("%.0f kilos of food left.", diff);
        }else {
            double diff = Math.ceil(allFoodNeeded-kgFood);
            System.out.printf("%.0f more kilos of food are needed.", diff);
        }
    }
}
