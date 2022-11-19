package ExamApril2019;

import java.util.Scanner;

public class P01EasterBakery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        цената на килограм захар е с 25% по-ниска от тази на килограм брашно
//        цената на една кора с яйца е с 10% по-висока от цената на килограм брашно
//        цената на един пакет мая е с 80% по-ниска от цената на килограм захар

        double flourPriceKg = Double.parseDouble(scan.nextLine());
        double neededFlourKG=Double.parseDouble(scan.nextLine());
        double neededSuggarKg = Double.parseDouble(scan.nextLine());
        int koriQica = Integer.parseInt(scan.nextLine());
        int paketiMaq = Integer.parseInt(scan.nextLine());

        double flourSum = flourPriceKg*neededFlourKG;
        double sugarPrice = flourPriceKg*0.75;
        double sugarSum=sugarPrice*neededSuggarKg;
        double koraQicaPrice = flourPriceKg*1.10;
        double koriQicaSum= koraQicaPrice*koriQica;
        double maqPrice= sugarPrice*0.20;
        double maqSum= maqPrice*paketiMaq;

        double finalSum=flourSum+sugarSum+koriQicaSum+maqSum;

        System.out.printf("%.2f",finalSum);

    }
}
