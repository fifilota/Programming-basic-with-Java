package PbMoreCondState;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int area = Integer.parseInt(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine()); // kg grapes for 1 kv.m
        int z = Integer.parseInt(scan.nextLine()); // liters needed
        int workers = Integer.parseInt(scan.nextLine());

        double kgGrapes = y * area;
        double wineProduction = (kgGrapes * 0.40) / 2.5;

        if (wineProduction < z) {
            double diff = Math.floor(z - wineProduction);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", diff);
        } else if (wineProduction >= z) {
            double diff = Math.ceil(wineProduction - z);
            double lPerWorker = Math.ceil(diff / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n%.0f liters left -> %.0f liters per person.", Math.floor(wineProduction), diff, lPerWorker);
        }
    }
}

