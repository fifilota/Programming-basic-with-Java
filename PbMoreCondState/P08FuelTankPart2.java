package PbMoreCondState;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Бензин – 2.22 лева за един литър,
//        Дизел – 2.33 лева за един литър
//        Газ – 0.93 лева за литър
//        Ако водача има карта за отстъпки,  той се възползва от следните намаления за литър гориво:
//        18 ст. за литър бензин, 12 ст. за литър дизел и 8 ст. за литър газ.
//        Ако шофьора е заредил между 20 и 25 литра включително, той получава 8 процента отстъпка от крайната цена,
//        при повече от 25 литра гориво, той получава 10 процента отстъпка от крайната цена.

        String fuelType = scan.nextLine();
        double liters = Double.parseDouble(scan.nextLine());
        String card = scan.nextLine();

        double sum = 0;

        switch (fuelType){
            case "Gasoline":
                sum=liters*2.22;
                if (card.equals("Yes")){
                    sum=liters*(2.22-0.18);
                }
                break;
            case "Diesel":
                sum=liters*2.33;
                if (card.equals("Yes")){
                    sum=liters*(2.33-0.12);
                }
                break;
            case "Gas":
                sum=liters*0.93;
                if (card.equals("Yes")){
                    sum=liters*(0.93-0.08);
                }
                break;
        }
        if (liters>=20 && liters<=25){
            sum=sum*0.92;
        } else if (liters>25) {
            sum=sum*0.90;
        }
        System.out.printf("%.2f lv.", sum);
    }
}
