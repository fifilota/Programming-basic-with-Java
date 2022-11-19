package CondStateAdvanExe;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int temperature = Integer.parseInt(scan.nextLine());
        String dayTime = scan.nextLine();

        String outfit = "";
        String shoes = "";

        if (temperature >= 10 && temperature <= 18){
            if (dayTime.equals("Morning")){
                outfit="Sweatshirt";
                shoes="Sneakers";
            } else if (dayTime.equals("Afternoon")) {
                outfit="Shirt";
                shoes="Moccasins";
            } else if (dayTime.equals("Evening")) {
                outfit="Shirt";
                shoes="Moccasins";
            }
        } else if (temperature >18 && temperature <= 24) {
            if (dayTime.equals("Morning")){
                outfit="Shirt";
                shoes="Moccasins";
            } else if (dayTime.equals("Afternoon")) {
                outfit="T-Shirt";
                shoes="Sandals";
            } else if (dayTime.equals("Evening")) {
                outfit="Shirt";
                shoes="Moccasins";
            }
        } else if (temperature>=25) {
            if (dayTime.equals("Morning")){
                outfit="T-Shirt";
                shoes="Sandals";
            } else if (dayTime.equals("Afternoon")) {
                outfit="Swim Suit";
                shoes="Barefoot";
            } else if (dayTime.equals("Evening")) {
                outfit="Shirt";
                shoes="Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);
    }
}
