package CondStateAdvanExe;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String accommodation = scan.nextLine();
        String rate = scan.nextLine();

        double price = 0;

        switch (accommodation){
            case "room for one person":
                price=(days-1)*18;
                break;
            case "apartment":
                price=(days-1)*25;
                if (days<=10){
                    price=price-price*0.30;
                } else if (days<=15) {
                    price=price-price*0.35;
                }else {
                    price=price-price*0.50;
                }
                break;
            case "president apartment":
                price=(days-1)*35;
                if (days<=10){
                    price=price-price*0.10;
                } else if (days<=15) {
                    price=price-price*0.15;
                }else {
                    price=price-price*0.20;
                }
                break;
        }
        if (rate.equals("positive")){
            price=price+price*0.25;
        } else if (rate.equals("negative")) {
            price=price-price*0.10;
        }
        System.out.printf("%.2f", price);

    }
}
