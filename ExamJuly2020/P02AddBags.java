package ExamJuly2020;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double price20KgAbove = Double.parseDouble(scan.nextLine());//цена на багаж над 20 кг
        double baggageKg =  Double.parseDouble(scan.nextLine());//кг-те багаж
        int daysToTrip = Integer.parseInt(scan.nextLine());//дни оставащи до пътуването
        int baggageCount = Integer.parseInt(scan.nextLine());//брой багажи

        double tptalPrice=0;//крайната сума за плащане

        if (baggageKg<10){//изчисляваме крайната сума според ки-те
            tptalPrice = price20KgAbove*0.20;
        } else if (baggageKg<=20) {
            tptalPrice= price20KgAbove/2;
        }else if (baggageKg>20){
            tptalPrice=price20KgAbove;
        }

        if (daysToTrip<7){//отново променяме крайната сума, но според оставащите дни
            tptalPrice=tptalPrice*1.40;
        } else if (daysToTrip<=30) {
            tptalPrice=tptalPrice*1.15;
        }else if (daysToTrip>30){
            tptalPrice=tptalPrice*1.10;
        }
        double finalPrice = tptalPrice*baggageCount;//накрая изчисляваме окончателната сума като умножим по проя багажи

        System.out.printf("The total price of bags is: %.2f lv.",finalPrice);
    }
}
