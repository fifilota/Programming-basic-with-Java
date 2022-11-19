package ExamApril2019;

import java.util.Scanner;

public class P01EasterLunch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Козунак  – 3.20 лв.
//                Яйца –  4.35 лв. за кора с 12 яйца
//        Курабии – 5.40 лв. за килограм
//        Боя за яйца - 0.15 лв. за яйце

        int kozunaciCount = Integer.parseInt(scan.nextLine());
        int koriQica = Integer.parseInt(scan.nextLine());
        int kurabiiKg = Integer.parseInt(scan.nextLine());

        double kozunaciPrice = kozunaciCount*3.20;
        double qicaPrice = koriQica*4.35;
        double kurabiiPrice = kurabiiKg*5.40;
        double boqPrice= koriQica*12*0.15;

        double finalSum= kozunaciPrice+qicaPrice+kurabiiPrice+boqPrice;

        System.out.printf("%.2f",finalSum);
    }
}
