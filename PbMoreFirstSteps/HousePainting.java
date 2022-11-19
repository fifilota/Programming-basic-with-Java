package PbMoreFirstSteps;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double areaHouse = (2*(x*y) - 2*(1.5*1.5)) + ((2*(x*x))-(1.2*2));
        double areaRoof = (2*(x*y)) + (2*(x*h)/2);

        double litreGreen = areaHouse / 3.4;
        double litreRed = areaRoof / 4.3;

        System.out.printf("%.2f%n%.2f", litreGreen, litreRed);
    }
}
