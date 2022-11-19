package ExamMay2019;

import java.util.Scanner;

public class P01FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scan.nextLine());
        double bananasKg= Double.parseDouble(scan.nextLine());
        double orangeKg =Double.parseDouble(scan.nextLine());
        double raspberriesKg = Double.parseDouble(scan.nextLine());
        double strawberriesKg = Double.parseDouble(scan.nextLine());

        double raspberriesPrice = strawberriesPrice/2;
        double orangePrice = raspberriesPrice*0.60;
        double bananasPrice = raspberriesPrice*0.20;

        double sumStrawberries = strawberriesKg*strawberriesPrice;
        double sumBananas = bananasKg*bananasPrice;
        double sumOrange = orangeKg*orangePrice;
        double sumRaspberries = raspberriesKg*raspberriesPrice;

        double allSum = sumBananas+sumOrange+sumRaspberries+sumStrawberries;

        System.out.printf("%.2f",allSum);
    }
}
