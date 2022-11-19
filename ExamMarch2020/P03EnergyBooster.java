package ExamMarch2020;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine(); // плодов вкус на напитката
        String size = scan.nextLine(); // размер на пакета: малък 2бр. или голям 5бр.
        int count = Integer.parseInt(scan.nextLine()); // брой пакети
        double price = 0; // крайната цена

        if (fruit.equals("Watermelon")) {
            if (size.equals("small")) {
                price = 56 * 2 * count; // пакетът е от 2 бройки, за това умножаваме по 2
            } else {
                price = 28.70 * 5 * count; // пакетът е от 5 бройки, за това умножаваме по 5
            }
        } else if (fruit.equals("Mango")) {
            if (size.equals("small")) {
                price=36.66*2*count;
            } else {
                price=19.60*5*count;
            }
        } else if (fruit.equals("Pineapple")) {
            if (size.equals("small")) {
                price=42.10*2*count;
            } else {
                price=24.80*5*count;
            }
        } else if (fruit.equals("Raspberry")) {
            if (size.equals("small")) {
                price=20*2*count;
            } else {
                price=15.20*5*count;
            }
        }
        if (price>=400 && price<=1000){
            price=price*0.85; // намаление от 15%
        } else if (price>1000) {
            price=price*0.50; // намаление от 50%
        }

        System.out.printf("%.2f lv.",price);

    }
}
