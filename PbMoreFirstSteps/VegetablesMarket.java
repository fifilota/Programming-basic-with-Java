package PbMoreFirstSteps;

import java.util.Scanner;

public class VegetablesMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double vegprice = Double.parseDouble(scan.nextLine());
        double fruitPrice = Double.parseDouble(scan.nextLine());
        double kgveg = Double.parseDouble(scan.nextLine());
        double kgfruits = Double.parseDouble(scan.nextLine());
        double profit = vegprice*kgveg + fruitPrice*kgfruits;
        double profitEU = profit/1.94;

        System.out.printf("%.2f", profitEU);
    }
}
