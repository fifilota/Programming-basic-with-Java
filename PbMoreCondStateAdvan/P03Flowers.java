package PbMoreCondStateAdvan;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scan.nextLine());
        int roses =Integer.parseInt(scan.nextLine());
        int tulips=Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        String festival = scan.nextLine();

        double bouquetPrice = 0;

        switch (season){
            case "Spring":
                bouquetPrice=chrysanthemums*2+roses*4.10+tulips*2.50;
                if (festival.equals("Y")){
                    bouquetPrice=bouquetPrice*1.15;
                }
                if (tulips>7){
                    bouquetPrice=bouquetPrice*0.95;
                }
                break;
            case "Summer":
                bouquetPrice=chrysanthemums*2+roses*4.10+tulips*2.50;
                if (festival.equals("Y")){
                    bouquetPrice=bouquetPrice*1.15;
                }
                break;
            case "Autumn":
                bouquetPrice=chrysanthemums*3.75+roses*4.50+tulips*4.15;
                if (festival.equals("Y")){
                    bouquetPrice=bouquetPrice*1.15;
                }
                break;
            case "Winter":
                bouquetPrice=chrysanthemums*3.75+roses*4.50+tulips*4.15;
                if (festival.equals("Y")){
                    bouquetPrice=bouquetPrice*1.15;
                }
                if (roses>=10){
                    bouquetPrice=bouquetPrice*0.90;
                }
                break;
        }
        if (chrysanthemums+roses+tulips>20){
            bouquetPrice=bouquetPrice*0.80;
        }
        bouquetPrice=bouquetPrice+2;

        System.out.printf("%.2f", bouquetPrice);
    }
}
